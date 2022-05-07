package vsu.radstat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.GenreEntity;

import java.util.List;

@Repository
public interface GenreRepository extends CrudRepository<GenreEntity, Integer>, JpaRepository<GenreEntity, Integer> {
    GenreEntity findByGenreId(Integer genreId);
    GenreEntity findByGenreName(String genreName);

    @Override
    List<GenreEntity> findAll();
}
