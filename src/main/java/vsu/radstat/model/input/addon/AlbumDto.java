package vsu.radstat.model.input.addon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AlbumDto {
    @JsonProperty("album_name")
    @NotEmpty
    private String albumName;
}
