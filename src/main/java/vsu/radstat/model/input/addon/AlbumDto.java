package vsu.radstat.model.input.addon;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AlbumDto {
    @NotEmpty
    private String albumName;
}
