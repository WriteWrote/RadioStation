package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.ProgramMapper;
import vsu.radstat.mapper.RecordMapper;
import vsu.radstat.model.entity.GenreEntity;
import vsu.radstat.model.entity.ProgramEntity;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;
import vsu.radstat.repository.*;
import vsu.radstat.service.IProgramService;

import javax.validation.Valid;
import java.time.Instant;
import java.util.*;

@Service
@Validated
@RequiredArgsConstructor
public class ProgramService implements IProgramService {
    private final ProgramRepository programRep;
    private final ProgramMapper programMap;

    private final RecordRepository recordRep;
    private final GenreRepository genreRep;
    private final RequestRepository requestRep;
    private final AlbumRepository albumRep;
    private final SingerRepository singerRep;
    private final AuthorRepository authorRep;

    @Override
    public OutputProgramDto createProgram(@Valid RequestProgramDto dto) {
        ProgramEntity e = programMap.toEntity(dto);
        List<RequestEntity> requests = new LinkedList<>();
        List<RecordEntity> records = new LinkedList<>();
        Double time = 0.0;
        int index = 0;

        try {
            GenreEntity genre = genreRep.findByName(dto.getGenreName());
            e.setGenreId(genre.getId());
            requests = requestRep.findAllByGenreAndCompleted(dto.getGenreName(), false);
        } catch (Exception ignored) {
            requests = requestRep.findAllByCompleted(false);
        }

        while (index < requests.size() && time < e.getLength() * 60) {
            RequestEntity currReq = requests.get(index);

            if (!Objects.equals(currReq.getComposition(), "")) {
                try {
                    RecordEntity record = recordRep.findByRecordName(currReq.getComposition());
                    records.add(record);
                    time += record.getTime();
                } catch (Exception ignored) {
                }
            } else if (!Objects.equals(currReq.getAlbum(), "")) {
                try {
                    RecordEntity r = getRecord(recordRep.findAllByAlbumId(albumRep.findByName(currReq.getAlbum()).getId()));
                    records.add(r);
                    time += r.getTime();
                } catch (Exception ignored) {
                }
            } else if (!Objects.equals(currReq.getSinger(), "")) {
                try {
                    RecordEntity r = getRecord(recordRep.findAllBySingerId(singerRep.findByName(currReq.getSinger()).getId()));
                    records.add(r);
                    time += r.getTime();
                } catch (Exception ignored) {
                }
            } else if (!Objects.equals(currReq.getAuthor(), "")) {
                try {
                    RecordEntity r = getRecord(recordRep.findAllByAuthorId(authorRep.findByName(currReq.getAuthor()).getId()));
                    records.add(r);
                    time += r.getTime();
                } catch (Exception ignored) {
                }
            } else {
                RecordEntity r = getRecord(recordRep.findAllByGenreId(genreRep.findByName(currReq.getGenre()).getId()));
                records.add(r);
                time += r.getTime();
            }

            currReq.setCompleted(true);
            if (time < e.getLength() * 60 && index + 1 >= requests.size()) {
                index = 0;
            } else {
                ++index;
            }
        }

        e.setRecords(records);
        programRep.save(e);

        return programMap.fromEntity(e);
    }

    @Override
    public OutputProgramDto findByProgramId(Integer id) {
        return programMap.fromEntity(programRep.findByProgramId(id));
    }

    @Override
    public List<OutputProgramDto> findAllByDate(Instant date) {
        return programMap.fromEntities(programRep.findAllByDate(date));
    }

    @Override
    public List<OutputProgramDto> findAllByLengthBetween(Integer l1, Integer l2) {
        return programMap.fromEntities(programRep.findAllByLengthBetween(l1, l2));
    }
    private RecordEntity getRecord(List<RecordEntity> l){
        int ind = (int) (Math.random() * (l.size() - 1));
        return l.get(ind);
    }
}
