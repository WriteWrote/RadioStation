package vsu.radstat.model.input_dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
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
