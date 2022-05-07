package vsu.radstat.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.AuthorEntity;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity,Integer>, JpaRepository<AuthorEntity,Integer> {
    AuthorEntity findByAuthorId(@NotNull Integer authorId);
    AuthorEntity findByAuthorName(@NotNull String authorName);

    @Override
    List<AuthorEntity> findAll();
}
