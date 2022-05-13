package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.*;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.addon.RecordDto;
import vsu.radstat.model.input.request.RequestDto;
import vsu.radstat.repository.*;
import vsu.radstat.service.IRequestService;

import javax.validation.Valid;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@Validated
@RequiredArgsConstructor
public class RequestService implements IRequestService {
    private final RequestRepository requestRepository;
    private final RequestMapper requestMapper;

    private final AlbumRepository albumRep;
    private final AlbumMapper albumMap;

    private final AuthorRepository authorRep;
    private final AuthorMapper authorMap;

    private final GenreRepository genreRep;
    private final GenreMapper genreMap;

    private final SingerRepository singerRep;
    private final SingerMapper singerMap;

//    private final RecordRepository recordRep;
//    private final RecordMapper recordMap;

    @Override
    public RequestDto createRequest(@Valid RequestDto dto) {
        RequestEntity e = requestMapper.toEntity(dto);
        //e.setDate(dto.getDate());
        requestRepository.save(e);

//        return Optional.of(dto)
//                .map(requestMapper::toEntity)
//                .map(requestRepository::save)
//                .map(requestMapper::fromEntity)
//                .orElseThrow();

        return dto;
    }

    @Override
    public RequestDto findByRequestId(Integer id) {
        RequestEntity e = requestRepository.findByRequestId(id);

//        return requestRepository.findById(id)
//                .map(requestMapper::fromEntity)
//                .orElse(null);

        return requestMapper.fromEntity(e);
    }

    @Override
    public List<RequestDto> findAll() {
        return requestMapper.fromEntities(requestRepository.findAll());
    }

    @Override
    public List<RequestDto> findAllByAlbum(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByAlbum(name));
    }

    @Override
    public List<RequestDto> findAllByAuthor(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByAuthor(name));
    }

    @Override
    public List<RequestDto> findAllByGenre(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByGenre(name));
    }

    @Override
    public List<RequestDto> findAllBySinger(String name) {
        return requestMapper.fromEntities(requestRepository.findAllBySinger(name));
    }

    @Override
    public List<RequestDto> findAllByComposition(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByComposition(name));
    }

    @Override
    public List<RequestDto> findAllCompletedByDate(Instant date) {
        return requestMapper.fromEntities(requestRepository.findAllByCompletedAndDate(true, date));
    }

    @Override
    public List<RequestDto> findAllByDate(Instant date) {
        return requestMapper.fromEntities(requestRepository.findAllByDate(date));
    }
//    private RequestDto ReplaceIdByName(RequestEntity e) {
//
//        RequestDto dto = requestMapper.fromEntity(e);
//        String n = "";
//
//        try {
//            n = Optional.of(albumRep.findById(e.getAlbumId()))
//                    .orElseThrow()
//                    .get()
//                    .getName();
//            dto.setAlbumName(n);
//        } catch (Exception ex) {
//            dto.setAlbumName("");
//        }
//        try {
//            n = Optional.of(authorRep.findById(e.getAuthorId()))
//                    .orElseThrow()
//                    .get()
//                    .getName();
//            dto.setAuthorName(n);
//        } catch (Exception ex) {
//            dto.setAuthorName("");
//        }
//        try {
//            n = Optional.of(genreRep.findById(e.getGenreId()))
//                    .orElseThrow()
//                    .get()
//                    .getName();
//            dto.setGenreName(n);
//        } catch (Exception ex) {
//            dto.setGenreName("");
//        }
//        try {
//            n = Optional.of(singerRep.findById(e.getSingerId()))
//                    .orElseThrow()
//                    .get()
//                    .getName();
//            dto.setSingerName(n);
//        } catch (Exception ex) {
//            dto.setSingerName("");
//        }
//
//        return dto;
//    }
}
