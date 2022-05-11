package vsu.radstat.model.responce;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import vsu.radstat.model.input.addon.RecordDto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class OutputProgramDto {
    //@JsonProperty("length")
    @NotEmpty
    private Integer length;

    @JsonProperty("genre_name")
    @NotEmpty
    private String genre;

    //@JsonProperty("date")
    @NotEmpty
    private Instant date;

    @NotEmpty
    List<RecordDto> records;
}
