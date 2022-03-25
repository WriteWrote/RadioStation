package vsu.radstat.model.input_dto.addon;

import lombok.Data;

@Data
public class RecordDto {
    private String composition;
    private String authorName;
    private String singerName;
    private String albumName;
    private Integer year;
    private Double time;
    private Double rating;
}
