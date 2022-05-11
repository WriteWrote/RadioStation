package vsu.radstat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.radstat.model.input.addon.AlbumDto;
import vsu.radstat.model.input.addon.AuthorDto;
import vsu.radstat.service.impl.AddonsService;

import java.util.List;

@RestController
@RequestMapping("/add")
public class AddonsController {
    private final AddonsService service;

    //ToDo: finish it before
    //Todo: finishing request controller
    //Todo: then finish services
    @Autowired
    public AddonsController(AddonsService service) {
        this.service = service;
    }

    //===========================================
    @PostMapping("/album")
    public AlbumDto createAlbum(AlbumDto dto) {
        return null;
    }

    @GetMapping("/album/{albumId}")
    public AlbumDto getAlbum() {
        return null;
    }

    @GetMapping("/albums")
    public List<AlbumDto> getAllAlbums() {
        return null;
    }

    //===========================================
    @PostMapping("/author")
    public AuthorDto createAuthor() {
        return null;
    }

    @GetMapping("/author/{authorId}")
    public AlbumDto getAuthor() {
        return null;
    }

    @GetMapping("/authors")
    public List<AlbumDto> getAllAuthors() {
        return null;
    }

    //===========================================
    @PostMapping("/genre")
    public AuthorDto createGenre() {
        return null;
    }

    @GetMapping("/genre/{genreId}")
    public AlbumDto getGenre() {
        return null;
    }

    @GetMapping("/genres")
    public List<AlbumDto> getAllGenres() {
        return null;
    }

    //===========================================
    @PostMapping("/singer")
    public AuthorDto createSinger() {
        return null;
    }

    @GetMapping("/singer/{singerId}")
    public AlbumDto getSinger() {
        //return service.findBySingerId();
        return null;
    }

    @GetMapping("/singer")
    public List<AlbumDto> getAllSingers() {
        //return service.findAllSingers();
        return null;
    }
}
