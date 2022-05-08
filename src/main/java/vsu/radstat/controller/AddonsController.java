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

    @Autowired
    public AddonsController(AddonsService service) {
        this.service = service;
    }
    //===========================================
    @PostMapping("/album")
    public AlbumDto createAlbum(AlbumDto dto){

    }

    @GetMapping("/album/{albumId}")
    public AlbumDto getAlbum(){

    }

    @GetMapping("/albums")
    public List<AlbumDto> getAllAlbums(){

    }
    //===========================================
    @PostMapping("/author")
    public AuthorDto createAuthor(){

    }
    @GetMapping("/author/{authorId}")
    public AlbumDto getAuthor(){

    }

    @GetMapping("/authors")
    public List<AlbumDto> getAllAuthors(){

    }
    //===========================================
    @PostMapping("/genre")
    public AuthorDto createGenre(){

    }
    @GetMapping("/genre/{genreId}")
    public AlbumDto getGenre(){

    }

    @GetMapping("/genres")
    public List<AlbumDto> getAllGenres(){

    }
    //===========================================
    @PostMapping("/singer")
    public AuthorDto createSinger(){

    }
    @GetMapping("/singer/{singerId}")
    public AlbumDto getSinger(){

    }

    @GetMapping("/singer")
    public List<AlbumDto> getAllSingers(){

    }
}
