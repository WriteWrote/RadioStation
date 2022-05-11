package vsu.radstat.model.input.addon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingerDto implements SimpleAddon{
    @JsonProperty("singer_name")
    @NotEmpty
    private String name;
}
