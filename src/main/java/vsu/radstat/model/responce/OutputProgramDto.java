package vsu.radstat.model.responce;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import vsu.radstat.model.input.addon.RecordDto;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OutputProgramDto {
    @JsonProperty("length")
    @NotEmpty
    private Integer length;

    @JsonProperty("genre_name")
    @NotEmpty
    private String genre;

    @JsonProperty("date")
    @NotEmpty
    private LocalDateTime date;

    @NotEmpty
    List<RecordDto> records;
}
