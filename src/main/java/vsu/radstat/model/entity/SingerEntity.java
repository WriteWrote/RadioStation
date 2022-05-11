package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "singer", schema = "radiostation")
public class SingerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "singer_id")
    private Integer id;

    @Column(name = "singer_name")
    @NotEmpty
    private String name;
}
