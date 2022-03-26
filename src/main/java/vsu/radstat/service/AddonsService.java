package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import vsu.radstat.model.entity.*;
import vsu.radstat.model.input_dto.addon.*;
import vsu.radstat.repository.*;

import java.util.UUID;

@RequiredArgsConstructor
public class AddonsService {
    private final AlbumRepository albumRepository;
    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;
    private final SingerRepository singerRepository;
    private final RecordRepository recordRepository;

    public void createAlbum(AlbumDto dto) throws Exception {
        AlbumEntity albumEntity = new AlbumEntity();
        //albumEntity.setAlbumId(0);
        albumEntity.setAlbumName(dto.getAlbumName());
        albumRepository.insert(albumEntity);
    }

    public void createAuthor(AuthorDto dto) throws Exception {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setAuthorName(dto.getAuthorName());
        authorRepository.insert(authorEntity);
    }

    public void createGenre(GenreDto dto) throws Exception {
        GenreEntity genreEntity = new GenreEntity();
        genreEntity.setGenreName(dto.getGenreName());
        genreRepository.insert(genreEntity);
    }

    public void createSinger(SingerDto dto) throws Exception {
        SingerEntity singerEntity = new SingerEntity();
        singerEntity.setSingerName(dto.getSingerName());
        singerRepository.insert(singerEntity);
    }

    public void createRecord(RecordDto dto) {
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

        } catch (Exception e) {

        }
    }
}
