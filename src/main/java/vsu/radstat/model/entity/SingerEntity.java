package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@Entity
@Table(name = "singer", schema = "radiostation")
public class SingerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "singer_id")
    private Integer singerId;

    @Column(name = "singer_name")
    @NotEmpty
    private String singerName;
}
