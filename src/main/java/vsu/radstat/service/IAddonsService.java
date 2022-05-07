package vsu.radstat.service;

import vsu.radstat.model.input.addon.*;

import javax.validation.Valid;

public interface IAddonsService {
    public void createAlbum(@Valid AlbumDto dto);

    public void createAuthor(@Valid AuthorDto dto);

    public void createGenre(@Valid GenreDto dto);

    public void createSinger(@Valid SingerDto dto);

    public void createRecord(@Valid RecordDto dto);
}
