package vsu.radstat.service;

import jakarta.validation.constraints.NotNull;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input.addon.*;

import javax.validation.Valid;
import java.util.List;

public interface IAddonsService {
    public AlbumDto createAlbum(@Valid AlbumDto dto);

    public AlbumDto findByAlbumId(Integer id);

    public AlbumDto findByAlbumName(String name);

    public List<AlbumDto> findAllAlbums();

    public AuthorDto createAuthor(@Valid AuthorDto dto);

    public AuthorDto findByAuthorId(Integer id);

    public AuthorDto findByAuthorName(String name);

    public List<AuthorDto> findAllAuthors();

    public GenreDto createGenre(@Valid GenreDto dto);

    public GenreDto findByGenreId(Integer id);

    public GenreDto findByGenreName(String name);

    public List<GenreDto> findAllGenres();

    public SingerDto createSinger(@Valid SingerDto dto);

    public SingerDto findBySingerId(Integer id);

    public SingerDto findBySingerName(String name);

    public List<SingerDto> findAllSingers();

    public RecordDto createRecord(@Valid RecordDto dto);

    public RecordDto findByRecordId(Integer id);
//TOdo: filter json for searchin'
    public RecordDto findByRecordName(String name);

    public List<RecordDto> findAllRecords();

    List<RecordEntity> findAllByAuthorId(Integer authorId);

    List<RecordEntity> findAllBySingerId(Integer singerId);

    List<RecordEntity> findAllByAlbumId(Integer albumId);

    List<RecordEntity> findAllByGenreId(Integer genreId);

    List<RecordEntity> findAllByYear(Integer year);

    List<RecordEntity> findAllByTimeLessThan(Double time);

    List<RecordEntity> findAllByTimeBetween(Double time, Double time2);

    List<RecordEntity> findAllByRatingGreaterThan(Double rating);

    List<RecordEntity> findAllByRatingBetween(Double rating, Double rating2);

}
