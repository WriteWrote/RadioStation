package vsu.radstat.exception.exists;

public class RecordAlreadyExistsException extends RuntimeException{
    private final Integer recordId;

    public RecordAlreadyExistsException(Integer recordId) {
        super(String.format("Record %d already exists", recordId));
        this.recordId = recordId;
    }

    public Integer getRecordId(){
        return recordId;
    }
}
