package vsu.radstat.model.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public class RequestEntity {
    private Integer requestId;

    // id's or actual names???

    private String composition;
    private String author;
    private String album;
    private String singer;
    private LocalDate date;
    private boolean completed;
}