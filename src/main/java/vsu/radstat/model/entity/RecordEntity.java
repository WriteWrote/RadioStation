package vsu.radstat.model.entity;

import lombok.Data;

@Data
public class RecordEntity {
    private Integer recordId;
    private String composition;
    private Integer authorId;
    private Integer singerId;
    private Integer albumId;
    private Integer year;
    private Double time;
    private Double rating;
}
