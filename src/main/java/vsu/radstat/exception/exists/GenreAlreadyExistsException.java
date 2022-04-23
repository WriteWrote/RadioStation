package vsu.radstat.exception.exists;

public class GenreAlreadyExistsException extends RuntimeException{
    private final Integer genreId;

    public GenreAlreadyExistsException(Integer genreId) {
        super(String.format("Genre %d already exists", genreId));
        this.genreId = genreId;
    }

    public Integer getGenreId(){
        return genreId;
    }
}
