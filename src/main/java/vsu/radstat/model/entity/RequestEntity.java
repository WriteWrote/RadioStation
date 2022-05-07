package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "request", schema = "radiostation")
public class RequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Integer requestId;

    // id's or actual names???

    @Column(name = "record_name")
    private String composition;

    @Column(name = "author_name")
    private String author;

    @Column(name = "album_name")
    private String album;

    @Column(name = "singer_name")
    private String singer;

    @Column(name = "date")
    @NotNull
    private Instant date;

    @Column(name = "completed")
    private boolean completed;
}
