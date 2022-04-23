package vsu.radstat.exception.exists;

public class SingerAlreadyExistsException extends RuntimeException{
    private final Integer singerId;

    public SingerAlreadyExistsException(Integer singerId) {
        super(String.format("Singer %d already exists", singerId));
        this.singerId = singerId;
    }

    public Integer getSingerId(){
        return singerId;
    }
}
