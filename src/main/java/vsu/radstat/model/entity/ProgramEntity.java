package vsu.radstat.model.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProgramEntity {
    private Integer programId;
    private Integer length;
    private Integer genreId;
    private LocalDateTime date;
    //@ManyToMany
    private List<RecordEntity> records;
}
