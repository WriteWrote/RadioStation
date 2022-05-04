package vsu.radstat.model.input.request;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestProgramDto {
    @NotNull
    @Min(1)
    @Max(3)
    private Integer length;
    @NotBlank
    private String genreName;
    @NotNull
    private LocalDateTime date;
}
