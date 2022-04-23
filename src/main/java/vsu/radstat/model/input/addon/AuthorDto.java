package vsu.radstat.model.input.addon;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AuthorDto {
    @NotEmpty
    private String authorName;
}
