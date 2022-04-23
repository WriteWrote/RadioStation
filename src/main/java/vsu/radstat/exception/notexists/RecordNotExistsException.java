package vsu.radstat.exception.notexists;

public class RecordNotExistsException extends RuntimeException{
    private final Integer recordId;

    public RecordNotExistsException(Integer recordId) {
        super(String.format("Record %d not exists", recordId));
        this.recordId = recordId;
    }

    public Integer getRecordId(){
        return recordId;
    }
}
