package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.*;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input.addon.*;
import vsu.radstat.repository.*;
import vsu.radstat.service.IAddonsService;

import javax.validation.Valid;
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
        return null;
    }

    @Override
    public AlbumDto findByAlbumName(String name) {
        return null;
    }

    @Override
    public List<AlbumDto> findAllAlbums() {
        return null;
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
        return null;
    }

    @Override
    public AuthorDto findByAuthorName(String name) {
        return null;
    }

    @Override
    public List<AuthorDto> findAllAuthors() {
        return null;
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
        return null;
    }

    @Override
    public GenreDto findByGenreName(String name) {
        return null;
    }

    @Override
    public List<GenreDto> findAllGenres() {
        return null;
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
        return null;
    }

    @Override
    public SingerDto findBySingerName(String name) {
        return null;
    }

    @Override
    public List<SingerDto> findAllSingers() {
        return null;
    }

    @Override
    public RecordDto createRecord(@Valid RecordDto dto) {
        return Optional.of(dto)
                .map(recordMap::toEntity)
                .map(recordRep::save)
                .map(recordMap::fromEntity)
                .orElseThrow();
    }

    @Override
    public RecordDto findByRecordId(Integer id) {
        return null;
    }

    @Override
    public RecordDto findByRecordName(String name) {
        return null;
    }

    @Override
    public List<RecordDto> findAllRecords() {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByAuthorId(Integer authorId) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllBySingerId(Integer singerId) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByAlbumId(Integer albumId) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByGenreId(Integer genreId) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByYear(Integer year) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByTimeLessThan(Double time) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByTimeBetween(Double time, Double time2) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByRatingGreaterThan(Double rating) {
        return null;
    }

    @Override
    public List<RecordEntity> findAllByRatingBetween(Double rating, Double rating2) {
        return null;
    }
}
