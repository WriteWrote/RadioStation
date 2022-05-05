package vsu.radstat.model.input.addon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SingerDto {
    @JsonProperty("singer_name")
    @NotEmpty
    private String singerName;
}
