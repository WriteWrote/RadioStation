package vsu.radstat.model.input.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FullRequestRecordDto {
    // get rid of @notblank
    @NotBlank
    private String composition;
    @NotBlank
    private String author;
    @NotBlank
    private String album;
    @NotBlank
    private String singer;

    @NotEmpty
    private LocalDate date;
}
