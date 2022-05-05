package vsu.radstat.model.input.addon;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AuthorDto {
    @JsonProperty("author_name")
    @NotEmpty
    private String authorName;
}
