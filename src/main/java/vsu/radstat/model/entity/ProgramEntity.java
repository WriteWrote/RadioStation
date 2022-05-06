package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
//@Entity
//@Table(name = "program", schema = "radiostation")
public class ProgramEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name = "program_id")
    private Integer programId;

    //@Column(name = "length")
//    @NotNull
    private Integer length;

   // @Column(name = "genre_id")
//    @NotNull
    private Integer genreId;

  //  @Column(name = "date")
//    @NotNull
    private LocalDateTime date;

//    @ManyToMany
    private List<RecordEntity> records;
}
