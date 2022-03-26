package vsu.radstat.model.output_dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import vsu.radstat.model.input_dto.addon.RecordDto;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OutputProgramDto {
    @NotEmpty
    private Integer length;
    @NotEmpty
    private String genre;
    @NotEmpty
    private LocalDateTime date;
    @NotEmpty
    List<RecordDto> records;
}
