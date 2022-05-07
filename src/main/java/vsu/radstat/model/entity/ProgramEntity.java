package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "program", schema = "radiostation")
public class ProgramEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")
    private Integer programId;

    @Column(name = "length")
    @NotNull
    private Integer length;

    @Column(name = "genre_id")
    @NotNull
    private Integer genreId;

    @Column(name = "date")
    @NotNull
    private Instant date;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "program_id", referencedColumnName = "program_id"),
            inverseJoinColumns = @JoinColumn(name = "record_id", referencedColumnName = "record_id"),
            name = "playbill",
            schema = "radiostation"
    )
    private List<RecordEntity> records;
//    @ManyToMany
//    @JoinTable(
//            joinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "allergy_id", referencedColumnName = "id"),
//            name = "patients_allergies",
//            schema = "healthtech"
//    )
//    private List<AllergyEntity> allergies;
}
