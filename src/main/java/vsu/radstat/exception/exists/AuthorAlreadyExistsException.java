package vsu.radstat.exception.exists;

public class AuthorAlreadyExistsException extends RuntimeException {
    private final Integer authorId;

    public AuthorAlreadyExistsException(Integer authorId) {
        super(String.format("Author %d already exists", authorId));
        this.authorId = authorId;
    }

    public Integer getAuthorId(){
        return authorId;
    }
}
