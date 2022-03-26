package vsu.radstat.model.input_dto.addon;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SingerDto {
    @NotEmpty
    private String singerName;
}
