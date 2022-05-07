package vsu.radstat.model.input.addon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecordDto {
    @JsonProperty("record_name")
    @NotEmpty
    private String composition;

    @JsonProperty("author_name")
    @NotEmpty
    private String authorName;

    @JsonProperty("singer_name")
    @NotEmpty
    private String singerName;

    @JsonProperty("album_name")
    @NotEmpty
    private String albumName;

    @JsonProperty("year")
    @Positive
    @Min(1000)
    private Integer year;

    @JsonProperty("time")
    @Positive
    @NotNull
    private Double time;

//    @PositiveOrZero
//    @NotNull
//    private Double rating;
}
