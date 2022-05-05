package vsu.radstat.model.input.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FullRequestRecordDto {
    @JsonProperty("record_name")
    private String composition;

    @JsonProperty("author_name")
    private String author;

    @JsonProperty("album_name")
    private String album;

    @JsonProperty("singer_name")
    private String singer;

    @JsonProperty("date")
    @NotEmpty
    private LocalDate date;
}
