package vsu.radstat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRun {
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
//        ProgramRepository programRepository = new ProgramRepository();
//        RequestRepository requestRepository = new RequestRepository();
//        RecordRepository recordRepository = new RecordRepository();
//        AuthorRepository authorRepository = new AuthorRepository();
//        AlbumRepository albumRepository = new AlbumRepository();
//        GenreRepository genreRepository = new GenreRepository();
//        SingerRepository singerRepository = new SingerRepository();
//        CreateAlbumValidator albumValidator = new CreateAlbumValidator();
//        CreateRecordValidator recordValidator = new CreateRecordValidator();
//        CreateSingerValidator singerValidator = new CreateSingerValidator();
//        CreateGenreValidator genreValidator = new CreateGenreValidator();
//        CreateAuthorValidator authorValidator = new CreateAuthorValidator();
//        CreateProgramRequestValidator programRequestValidator = new CreateProgramRequestValidator();
//        RecordRequestValidator requestValidator = new RecordRequestValidator();
//
//        ProgramService programService = new ProgramService(
//                programRepository, requestRepository, recordRepository,
//                authorRepository, albumRepository, genreRepository, singerRepository,
//                programRequestValidator);
//
//        AddonsService addonsService = new AddonsService(albumRepository,authorRepository,
//                genreRepository, singerRepository, recordRepository,
//                albumValidator, authorValidator, genreValidator, singerValidator, recordValidator);
//
//        RequestService requestService = new RequestService(requestRepository, requestValidator);
//
//        // insert author, album, singer
//        AlbumDto albumDto = new AlbumDto();
//        albumDto.setAlbumName("Album1");
//        try {
//            addonsService.createAlbum(albumDto);
//        } catch (Exception e) {
//            System.out.println("Error while creating new album");
//        }
//
//        AuthorDto authorDto = new AuthorDto();
//        albumDto.setAlbumName("Author1");
//        try {
//            addonsService.createAuthor(authorDto);
//        } catch (Exception e) {
//            System.out.println("Error while creating new author");
//        }
//
//        SingerDto singerDto = new SingerDto();
//        albumDto.setAlbumName("Singer1");
//        try {
//            addonsService.createSinger(singerDto);
//        } catch (Exception e) {
//            System.out.println("Error while creating new singer");
//        }
//
//
//        FullRequestRecordDto recordRequest = new FullRequestRecordDto();
//
//        recordRequest.setComposition("Composition1");
//        recordRequest.setAuthor("Author1");
//        recordRequest.setAlbum("Album1");
//        recordRequest.setSinger("Singer1");
//        recordRequest.setDate(LocalDate.now());
//
//        try {
//            requestService.createRequest(recordRequest);
//        } catch (Exception e) {
//            System.out.println("Error while creating request");
//        }
//
//        RecordDto recordDto = new RecordDto();
//
//        recordDto.setComposition(recordRequest.getComposition());
//        recordDto.setAuthorName(recordRequest.getAuthor());
//        recordDto.setAlbumName(recordRequest.getAlbum());
//        recordDto.setSingerName(recordRequest.getSinger());
//        recordDto.setYear(2018);
//        recordDto.setTime(3.55);
//
//        addonsService.createRecord(recordDto);
//
//        RequestProgramDto programRequest = new RequestProgramDto();
//
//        programRequest.setDate(LocalDateTime.now());
//        programRequest.setGenreName("Genre");
//        programRequest.setLength(new Random().nextInt(2) + 1);
//
//        OutputProgramDto result = programService.createProgram(programRequest);
    }
}
