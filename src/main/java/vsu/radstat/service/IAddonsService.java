package vsu.radstat.service;

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

    List<RecordDto> findAllByAuthorId(Integer authorId);

    List<RecordDto> findAllBySingerId(Integer singerId);

    List<RecordDto> findAllByAlbumId(Integer albumId);

    List<RecordDto> findAllByGenreId(Integer genreId);

    List<RecordDto> findAllByYear(Integer year);

    List<RecordDto> findAllByTimeLessThan(Double time);

    List<RecordDto> findAllByTimeBetween(Double time, Double time2);

    List<RecordDto> findAllByRatingGreaterThan(Double rating);

    List<RecordDto> findAllByRatingBetween(Double rating, Double rating2);

}
