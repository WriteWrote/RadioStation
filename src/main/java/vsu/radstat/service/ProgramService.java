package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.addon.RecordDto;
import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;
import vsu.radstat.repository.*;
import vsu.radstat.validator.CreateProgramRequestValidator;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ProgramService {
    private final ProgramRepository programRepository;
    private final RequestRepository requestRepository;
    private final RecordRepository recordRepository;

    // rework
    private final AuthorRepository authorRepository;
    private final AlbumRepository albumRepository;
    private final GenreRepository genreRepository;
    private final SingerRepository singerRepository;

    private final CreateProgramRequestValidator programRequestValidator;

    public OutputProgramDto createProgram(RequestProgramDto dto) {
        if (!programRequestValidator.validate(dto)){
            throw new RuntimeException();
        }
        //private List<RecordEntity> records;

        OutputProgramDto output = new OutputProgramDto();
        output.setDate(dto.getDate());
        output.setGenre(dto.getGenreName());

        // todo: actual logic
        // this is puppet logic
        // just taking first full request and taking first record from this full request

        //Todo: вставить защиту, что никаких реквестов нет
        List<RequestEntity> requestEntityList = requestRepository.findAllUncompleted();
        List<RecordEntity> recordEntityList = new ArrayList<>();

        for (RequestEntity e :
                requestEntityList) {
            RecordEntity r = recordRepository.findByComposition(e.getComposition());
            // actually need to compare two RecordEntity by customized .equals(),
            // but let's pretend this is exactly the record we are searching
            recordEntityList.add(r);
        }
        // also need to insert sorting logic here to erase duplicates at least
        // for converting need mappers actually
        List<RecordDto> recordDtoList = new ArrayList<>();

        for (RecordEntity e :
                recordEntityList) {
            RecordDto d = new RecordDto();

            d.setComposition(e.getComposition());
            d.setAuthorName(authorRepository.findById(e.getAuthorId()).getAuthorName());
            d.setAlbumName(albumRepository.findById(e.getAlbumId()).getAlbumName());
            d.setSingerName(singerRepository.findById(e.getSingerId()).getSingerName());
            d.setYear(e.getYear());
            d.setTime(e.getTime());

            recordDtoList.add(d);

            output.setLength(output.getLength() + Integer.parseInt(String.valueOf(d.getTime())));
        }

        output.setRecords(recordDtoList);

        return output;
    }
}
