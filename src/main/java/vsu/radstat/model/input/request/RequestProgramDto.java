package vsu.radstat.model.input.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestProgramDto {
    @NotEmpty
    @Min(1)
    @Max(3)
    private Integer length;
    @NotEmpty
    private String genreName;
    @NotEmpty
    private LocalDateTime date;
}
