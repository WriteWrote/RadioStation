package vsu.radstat.exception.notexists;

public class AuthorNotExistsException extends RuntimeException{
    private final Integer authorId;

    public AuthorNotExistsException(Integer authorId) {
        super(String.format("Author %d not exists", authorId));
        this.authorId = authorId;
    }

    public Integer getAuthorId(){
        return authorId;
    }
}
