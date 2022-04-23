package vsu.radstat.exception.notexists;

public class SingerNotExistsException extends RuntimeException{
    private final Integer singerId;

    public SingerNotExistsException(Integer singerId) {
        super(String.format("Singer %d not exists", singerId));
        this.singerId = singerId;
    }

    public Integer getSingerId(){
        return singerId;
    }
}
