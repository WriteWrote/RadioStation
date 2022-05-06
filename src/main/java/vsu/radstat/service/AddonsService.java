package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vsu.radstat.exception.exists.AlbumAlreadyExistsException;
import vsu.radstat.exception.exists.AuthorAlreadyExistsException;
import vsu.radstat.exception.exists.GenreAlreadyExistsException;
import vsu.radstat.exception.exists.SingerAlreadyExistsException;
import vsu.radstat.exception.notexists.AlbumNotExistsException;
import vsu.radstat.exception.notexists.AuthorNotExistsException;
import vsu.radstat.exception.notexists.SingerNotExistsException;
import vsu.radstat.model.entity.*;
import vsu.radstat.model.input.addon.*;
import vsu.radstat.repository.*;
import vsu.radstat.validator.*;

import javax.xml.validation.Validator;

@Service
@RequiredArgsConstructor
public class AddonsService {
    private final AlbumRepository albumRepository;
    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;
    private final SingerRepository singerRepository;
    private final RecordRepository recordRepository;

    //ToDo: один валидатор для всех аддонов или несколько?
    private final CreateAlbumValidator albumValidator;
    private final CreateAuthorValidator authorValidator;
    private final CreateGenreValidator genreValidator;
    private final CreateSingerValidator singerValidator;
    private final CreateRecordValidator recordValidator;

    public void createAlbum(AlbumDto dto) throws AlbumAlreadyExistsException {
        if (!albumValidator.validate(dto)){
            //todo: redo this exception
            throw new RuntimeException();
        }

        AlbumEntity albumEntity = new AlbumEntity();
        //albumEntity.setAlbumId(0);
        albumEntity.setAlbumName(dto.getAlbumName());
        albumRepository.insert(albumEntity);
    }

    public void createAuthor(AuthorDto dto) throws AuthorAlreadyExistsException {
        if (!authorValidator.validate(dto)){
            throw new RuntimeException();
        }
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setAuthorName(dto.getAuthorName());
        authorRepository.insert(authorEntity);
    }

    public void createGenre(GenreDto dto) throws GenreAlreadyExistsException {
        if (!genreValidator.validate(dto)){
            throw new RuntimeException();
        }
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setGenreName(dto.getGenreName());
        genreRepository.insert(genreEntity);
    }

    public void createSinger(SingerDto dto) throws SingerAlreadyExistsException {
        if(!singerValidator.validate(dto)){
            throw new RuntimeException();
        }
        SingerEntity singerEntity = new SingerEntity();
        singerEntity.setSingerName(dto.getSingerName());
        singerRepository.insert(singerEntity);
    }

    public void createRecord(RecordDto dto) {
        if(!recordValidator.validate(dto)){
            throw new RuntimeException();
        }

        RecordEntity recordEntity = new RecordEntity();

        recordEntity.setComposition(dto.getComposition());
        //recordEntity.setRating(dto.getRating());
        recordEntity.setRating(0.);
        recordEntity.setTime(dto.getTime());
        recordEntity.setYear(dto.getYear());

        //CAREFUL THERE
        // TODO: NEED TO CHECK WHAT RETURNS IF THERE IS NO AUTHORS/ALBUMS/SINGERS
        try {
            Integer authorId = authorRepository.findByName(dto.getAuthorName()).getAuthorId();
            Integer albumId = albumRepository.findByName(dto.getAlbumName()).getAlbumId();
            Integer singerId = singerRepository.findByName(dto.getSingerName()).getSingerId();

            recordEntity.setAuthorId(authorId);
            recordEntity.setAlbumId(albumId);
            recordEntity.setSingerId(singerId);

            recordRepository.insert(recordEntity);

        }
        //Todo: think what to do w/ exceptions
        catch (AuthorNotExistsException | AlbumNotExistsException | SingerNotExistsException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
