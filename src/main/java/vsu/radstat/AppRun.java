package vsu.radstat;

import vsu.radstat.model.input_dto.addon.AlbumDto;
import vsu.radstat.model.input_dto.addon.AuthorDto;
import vsu.radstat.model.input_dto.addon.RecordDto;
import vsu.radstat.model.input_dto.addon.SingerDto;
import vsu.radstat.model.input_dto.request.FullRequestDto;
import vsu.radstat.model.input_dto.request.RequestProgramDto;
import vsu.radstat.model.output_dto.OutputProgramDto;
import vsu.radstat.repository.*;
import vsu.radstat.service.AddonsService;
import vsu.radstat.service.ProgramService;
import vsu.radstat.service.RequestService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class AppRun {
    public static void main(String[] args) {
        ProgramService programService = new ProgramService(
                new ProgramRepository(),
                new RequestRepository(),
                new RecordRepository(),
                new AuthorRepository(),
                new AlbumRepository(),
                new GenreRepository(),
                new SingerRepository());

        AddonsService addonsService = new AddonsService(new AlbumRepository(), new AuthorRepository(),
                new GenreRepository(), new SingerRepository(), new RecordRepository());

        RequestService requestService = new RequestService(new RequestRepository());

        // insert author, album, singer
        AlbumDto albumDto = new AlbumDto();
        albumDto.setAlbumName("Album1");
        try {
            addonsService.createAlbum(albumDto);
        } catch (Exception e){
            System.out.println("Error while creating new album");
        }

        AuthorDto authorDto = new AuthorDto();
        albumDto.setAlbumName("Author1");
        try {
            addonsService.createAuthor(authorDto);
        } catch (Exception e){
            System.out.println("Error while creating new author");
        }

        SingerDto singerDto = new SingerDto();
        albumDto.setAlbumName("Singer1");
        try {
            addonsService.createSinger(singerDto);
        } catch (Exception e){
            System.out.println("Error while creating new singer");
        }


        FullRequestDto recordRequest = new FullRequestDto();

        recordRequest.setComposition("Composition1");
        recordRequest.setAuthor("Author1");
        recordRequest.setAlbum("Album1");
        recordRequest.setSinger("Singer1");
        recordRequest.setDate(LocalDate.now());

        try {
            requestService.createRequest(recordRequest);
        } catch (Exception e) {
            System.out.println("Error while creating request");
        }

        RecordDto recordDto = new RecordDto();

        recordDto.setComposition(recordRequest.getComposition());
        recordDto.setAuthorName(recordRequest.getAuthor());
        recordDto.setAlbumName(recordRequest.getAlbum());
        recordDto.setSingerName(recordRequest.getSinger());
        recordDto.setYear(2018);
        recordDto.setTime(3.55);

        addonsService.createRecord(recordDto);

        RequestProgramDto programRequest = new RequestProgramDto();

        programRequest.setDate(LocalDateTime.now());
        programRequest.setGenreName("Genre");
        programRequest.setLength(new Random().nextInt(2) + 1);

        OutputProgramDto result = programService.createProgram(programRequest);
    }
}
