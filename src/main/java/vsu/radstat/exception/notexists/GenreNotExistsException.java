package vsu.radstat.exception.notexists;

public class GenreNotExistsException extends RuntimeException{
    private final Integer genreId;

    public GenreNotExistsException(Integer genreId) {
        super(String.format("Genre %d not exists", genreId));
        this.genreId = genreId;
    }

    public Integer getGenreId(){
        return genreId;
    }
}
