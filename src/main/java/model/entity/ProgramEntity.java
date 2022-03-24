package model.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ProgramEntity {
    private Integer programId;
    private Integer length;
    private Integer genreId;
    private LocalDateTime date;
}
