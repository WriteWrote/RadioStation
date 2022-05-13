package vsu.radstat.service.impl;

import jakarta.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.*;
import vsu.radstat.model.entity.AlbumEntity;
import vsu.radstat.model.entity.AuthorEntity;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input.addon.*;
import vsu.radstat.repository.*;
import vsu.radstat.service.IAddonsService;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
@Validated
@RequiredArgsConstructor
public class AddonsService implements IAddonsService {

    private final AlbumRepository albumRep;
    private final AlbumMapper albumMap;

    private final AuthorRepository authorRep;
    private final AuthorMapper authorMap;

    private final GenreRepository genreRep;
    private final GenreMapper genreMap;

    private final SingerRepository singerRep;
    private final SingerMapper singerMap;

    private final RecordRepository recordRep;
    private final RecordMapper recordMap;

    @Override
    public AlbumDto createAlbum(@Valid AlbumDto dto) {
        return Optional.of(dto)
                .map(albumMap::toEntity)
                .map(albumRep::save)
                .map(albumMap::fromEntity)
                .orElseThrow();
    }

    @Override
    public AlbumDto findByAlbumId(Integer id) {
        return albumRep.findById(id).map(albumMap::fromEntity).orElse(null);
        //return albumMap.fromEntity(albumRep.findByAlbumId(id));
        //return null;
    }

    @Override
    public AlbumDto findByAlbumName(String name) {
        //return albumMap.fromEntity(albumRep.findByAlbumName(name));
        return null;
    }

    @Override
    public List<AlbumDto> findAllAlbums() {
        return albumMap.fromEntities(albumRep.findAll());
    }

    @Override
    public AuthorDto createAuthor(@Valid AuthorDto dto) {
        return Optional.of(dto)
                .map(authorMap::toEntity)
                .map(authorRep::save)
                .map(authorMap::fromEntity)
                .orElseThrow();
    }

    @Override
    public AuthorDto findByAuthorId(Integer id) {
        //return authorMap.fromEntity(authorRep.findByAuthorId(id));
        return authorRep.findById(id).map(authorMap::fromEntity).orElse(null);
    }

    @Override
    public AuthorDto findByAuthorName(String name) {
        return authorMap.fromEntity(authorRep.findByName(name));
    }

    @Override
    public List<AuthorDto> findAllAuthors() {
        return authorMap.fromEntities(authorRep.findAll());
    }

    @Override
    public GenreDto createGenre(@Valid GenreDto dto) {
        return Optional.of(dto)
                .map(genreMap::toEntity)
                .map(genreRep::save)
                .map(genreMap::fromEntity)
                .orElseThrow();
    }

    @Override
    public GenreDto findByGenreId(Integer id) {
        //return genreMap.fromEntity(genreRep.findByGenreId(id));
        return genreRep.findById(id).map(genreMap::fromEntity).orElse(null);
    }

    @Override
    public GenreDto findByGenreName(String name) {
        return genreMap.fromEntity(genreRep.findByName(name));
    }

    @Override
    public List<GenreDto> findAllGenres() {
        return genreMap.fromEntities(genreRep.findAll());
    }

    @Override
    public SingerDto createSinger(@Valid SingerDto dto) {
        return Optional.of(dto)
                .map(singerMap::toEntity)
                .map(singerRep::save)
                .map(singerMap::fromEntity)
                .orElseThrow();
    }

    @Override
    public SingerDto findBySingerId(Integer id) {
        //return singerMap.fromEntity(singerRep.findBySingerId(id));
        return singerRep.findById(id).map(singerMap::fromEntity).orElse(null);
    }

    @Override
    public SingerDto findBySingerName(String name) {
        return singerMap.fromEntity(singerRep.findByName(name));
    }

    @Override
    public List<SingerDto> findAllSingers() {
        return singerMap.fromEntities(singerRep.findAll());
    }

    @Override
    public RecordDto createRecord(@Valid RecordDto dto) {
        RecordEntity e = recordMap.toEntity(dto);
        Integer id;
        // TodO: отправлять внятные сообщения
        try {
            id = authorRep.findByName(dto.getAuthorName()).getId();
            e.setAuthorId(id);
        } catch (Exception ex) {
            e.setAuthorId(null);
        }
        try {
            id = albumRep.findByName(dto.getAlbumName()).getId();
            e.setAlbumId(id);
        } catch (Exception ex) {
            e.setAlbumId(null);
        }
        try {
            id = singerRep.findByName(dto.getSingerName()).getId();
            e.setSingerId(id);
        } catch (Exception ex) {
            e.setSingerId(null);
        }
        try {
            id = genreRep.findByName(dto.getGenreName()).getId();
            e.setGenreId(id);
        } catch (Exception ex) {
            e.setGenreId(null);
        }

        recordRep.save(e);
//        return Optional.of(e)
//                .map(recordRep::save)
//                .map(recordMap::fromEntity)
//                .orElseThrow();
        return dto;
    }

    @Override
    public RecordDto findByRecordId(Integer id) {
        RecordEntity e = recordRep.findByRecordId(id);
        return this.ReplaceIdByName(e);
    }

    @Override
    public RecordDto findByRecordName(String name) {
        //return recordMap.fromEntity(recordRep.findByRecordName(name));
        RecordEntity e = recordRep.findByRecordName(name);
        return this.ReplaceIdByName(e);
    }

    @Override
    public List<RecordDto> findAllRecords() {
        //return recordMap.fromEntities(recordRep.findAll());
        List<RecordEntity> list = recordRep.findAll();
        List<RecordDto> result = new LinkedList<>();
        for (RecordEntity e :
                list) {
            result.add(this.ReplaceIdByName(e));
        }
        return result;
    }

    @Override
    public List<RecordDto> findAllByAuthorId(Integer authorId) {
        return recordMap.fromEntities(recordRep.findAllByAuthorId(authorId));
    }

    @Override
    public List<RecordDto> findAllBySingerId(Integer singerId) {
        return recordMap.fromEntities(recordRep.findAllBySingerId(singerId));
    }

    @Override
    public List<RecordDto> findAllByAlbumId(Integer albumId) {
        return recordMap.fromEntities(recordRep.findAllByAlbumId(albumId));
    }

    @Override
    public List<RecordDto> findAllByGenreId(Integer genreId) {
        return recordMap.fromEntities(recordRep.findAllByGenreId(genreId));
    }

    @Override
    public List<RecordDto> findAllByYear(Integer year) {
        return recordMap.fromEntities(recordRep.findAllByYear(year));
    }

    @Override
    public List<RecordDto> findAllByTimeLessThan(Double time) {
        return recordMap.fromEntities(recordRep.findAllByTimeLessThan(time));
    }

    @Override
    public List<RecordDto> findAllByTimeBetween(Double time, Double time2) {
        return recordMap.fromEntities(recordRep.findAllByTimeBetween(time, time2));
    }

    @Override
    public List<RecordDto> findAllByRatingGreaterThan(Double rating) {
        return recordMap.fromEntities(recordRep.findAllByRatingGreaterThan(rating));
    }

    @Override
    public List<RecordDto> findAllByRatingBetween(Double rating, Double rating2) {
        return recordMap.fromEntities(recordRep.findAllByRatingBetween(rating, rating2));
    }

    private RecordDto ReplaceIdByName(RecordEntity e) {

        RecordDto dto = recordMap.fromEntity(e);
        String n = "";

        try {
            n = Optional.of(albumRep.findById(e.getAlbumId()))
                    .orElseThrow()
                    .get()
                    .getName();
            dto.setAlbumName(n);
        } catch (Exception ex) {
            dto.setAlbumName("");
        }
        try {
            n = Optional.of(authorRep.findById(e.getAuthorId()))
                    .orElseThrow()
                    .get()
                    .getName();
            dto.setAuthorName(n);
        } catch (Exception ex) {
            dto.setAuthorName("");
        }
        try {
            n = Optional.of(genreRep.findById(e.getGenreId()))
                    .orElseThrow()
                    .get()
                    .getName();
            dto.setGenreName(n);
        } catch (Exception ex) {
            dto.setGenreName("");
        }
        try {
            n = Optional.of(singerRep.findById(e.getSingerId()))
                    .orElseThrow()
                    .get()
                    .getName();
            dto.setSingerName(n);
        } catch (Exception ex) {
            dto.setSingerName("");
        }

        return dto;
    }
}
