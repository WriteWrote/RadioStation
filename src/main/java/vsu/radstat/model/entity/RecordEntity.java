package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "record", schema = "radiostation")
public class RecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private Integer recordId;

    @Column(name = "record_name")
    @NotEmpty
    private String composition;

    @Column(name = "author_id")
    @NotNull
    private Integer authorId;

    @Column(name = "singer_id")
    @NotNull
    private Integer singerId;

    @Column(name = "album_id")
    @NotNull
    private Integer albumId;

    @Column(name = "year")
    @NotNull
    private Integer year;

    @Column(name = "time")
    @NotNull
    private Double time;

    @Column(name = "rating")
    @NotNull
    private Double rating;

//    @ManyToMany
//    List<ProgramEntity> programEntityList;
}
