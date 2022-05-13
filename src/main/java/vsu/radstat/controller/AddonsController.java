package vsu.radstat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vsu.radstat.model.input.addon.AlbumDto;
import vsu.radstat.model.input.addon.AuthorDto;
import vsu.radstat.model.input.addon.GenreDto;
import vsu.radstat.model.input.addon.SingerDto;
import vsu.radstat.service.impl.AddonsService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/add")
public class AddonsController {
    private final AddonsService service;

    @Autowired
    public AddonsController(AddonsService service) {
        this.service = service;
    }

    //===========================================
    @PostMapping("/album")
    public AlbumDto createAlbum(@RequestBody AlbumDto dto) {
        return service.createAlbum(dto);
    }

    @GetMapping("/album/{albumId}")
    public AlbumDto getAlbum(@PathVariable Integer albumId) {
        return service.findByAlbumId(albumId);
    }

    @GetMapping("/albums")
    public List<AlbumDto> getAllAlbums() {
        return service.findAllAlbums();
    }

    //===========================================
    @PostMapping("/author")
    public AuthorDto createAuthor(@RequestBody AuthorDto dto) {
        return service.createAuthor(dto);
    }

    @GetMapping("/author/{authorId}")
    public AuthorDto getAuthor(@PathVariable Integer authorId) {
        return service.findByAuthorId(authorId);
    }

    @GetMapping("/authors")
    public List<AuthorDto> getAllAuthors() {
        return service.findAllAuthors();
    }

    //===========================================
    @PostMapping("/genre")
    public GenreDto createGenre(@RequestBody GenreDto dto) {
        return service.createGenre(dto);
    }

    @GetMapping("/genre/{genreId}")
    public GenreDto getGenre(@PathVariable Integer genreId) {
        return service.findByGenreId(genreId);
    }

    @GetMapping("/genres")
    public List<GenreDto> getAllGenres() {
        return service.findAllGenres();
    }

    //===========================================
    @PostMapping("/singer")
    public SingerDto createSinger(@RequestBody SingerDto dto) {
        return service.createSinger(dto);
    }

    @GetMapping("/singer/{singerId}")
    public SingerDto getSinger(@PathVariable Integer singerId) {
        return service.findBySingerId(singerId);
    }

    @GetMapping("/singers")
    public List<SingerDto> getAllSingers() {
        return service.findAllSingers();
    }
}
