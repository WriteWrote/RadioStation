package vsu.radstat.model.input.addon;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RecordDto {
    @NotEmpty
    private String composition;

    @NotEmpty
    private String authorName;

    @NotEmpty
    private String singerName;

    @NotEmpty
    private String albumName;

    @Positive
    @Min(1000)
    private Integer year;

    @Positive
    @NotNull
    private Double time;

//    @PositiveOrZero
//    @NotNull
//    private Double rating;
}
