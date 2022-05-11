package vsu.radstat.model.input.addon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenreDto implements SimpleAddon{
    @JsonProperty("genre_name")
    @NotEmpty
    private String genreName;
}
