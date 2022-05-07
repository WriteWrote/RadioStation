package vsu.radstat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.AuthorEntity;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity,Integer>, JpaRepository<AuthorEntity,Integer> {
    AuthorEntity findByAuthorId(Integer authorId);
    AuthorEntity findByAuthorName(String authorName);

    @Override
    List<AuthorEntity> findAll();
}
