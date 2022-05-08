package vsu.radstat.service;

import vsu.radstat.model.input.addon.*;

import javax.validation.Valid;

public interface IAddonsService {
    public AlbumDto createAlbum(@Valid AlbumDto dto);

    public AuthorDto createAuthor(@Valid AuthorDto dto);

    public GenreDto createGenre(@Valid GenreDto dto);

    public SingerDto createSinger(@Valid SingerDto dto);

    public RecordDto createRecord(@Valid RecordDto dto);
}
