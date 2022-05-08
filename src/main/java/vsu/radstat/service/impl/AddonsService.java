package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.*;
import vsu.radstat.model.input.addon.*;
import vsu.radstat.repository.*;
import vsu.radstat.service.IAddonsService;

import javax.validation.Valid;
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
    public AuthorDto createAuthor(@Valid AuthorDto dto) {
        return Optional.of(dto)
                .map(authorMap::toEntity)
                .map(authorRep::save)
                .map(authorMap::fromEntity)
                .orElseThrow();
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
    public SingerDto createSinger(@Valid SingerDto dto) {
        return Optional.of(dto)
                .map(singerMap::toEntity)
                .map(singerRep::save)
                .map(singerMap::fromEntity)
                .orElseThrow();
    }

    @Override
    public RecordDto createRecord(@Valid RecordDto dto) {
        return Optional.of(dto)
                .map(recordMap::toEntity)
                .map(recordRep::save)
                .map(recordMap::fromEntity)
                .orElseThrow();
    }
}
