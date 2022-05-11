package vsu.radstat.model.input.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
public class RequestProgramDto {
    @JsonProperty("length")
    @NotNull
    @Min(1)
    @Max(3)
    private Integer length;

    @JsonProperty("genre_name")
    @NotBlank
    private String genreName;

    @JsonProperty("date")
    @NotNull
    @FutureOrPresent(message = "date.is-past")
    private Instant date;
}
