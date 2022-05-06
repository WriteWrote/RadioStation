package vsu.radstat.model.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import javax.persistence.*;

@Data
//@Entity
//@Table(name = "author", schema = "radiostation")
public class AuthorEntity {
  //  @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @Column(name = "author_id")
    private Integer authorId;

    //@Column(name = "author_name")
//    @NotEmpty
    private String authorName;
}
