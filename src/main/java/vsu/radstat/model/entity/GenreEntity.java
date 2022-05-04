package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "genre", schema = "radiostation")
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Integer genreId;

    @Column(name = "genre_name")
    @NotEmpty
    private String genreName;
}
