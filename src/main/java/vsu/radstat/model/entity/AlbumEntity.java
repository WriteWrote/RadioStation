package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "album", schema = "radiostation")
public class AlbumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private Integer albumId;

    @Column(name = "album_name")
    @NotEmpty
    private String albumName;
}
