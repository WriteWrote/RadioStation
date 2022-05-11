package vsu.radstat.model.input.addon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlbumDto implements SimpleAddonDto {
    @JsonProperty("album_name")
    @NotEmpty
    private String name;
}
