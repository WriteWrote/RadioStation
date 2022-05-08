package vsu.radstat.model.input.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RequestDto {
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
