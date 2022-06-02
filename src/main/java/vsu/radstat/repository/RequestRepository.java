package vsu.radstat.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.RequestEntity;

import java.time.Instant;
import java.util.List;

@Repository
public interface RequestRepository extends CrudRepository<RequestEntity, Integer>, JpaRepository<RequestEntity, Integer> {
    RequestEntity findByRequestId(@NotNull Integer requestId);

    @Override
    List<RequestEntity> findAll();

    List<RequestEntity> findAllByAuthor(@NotNull String author);
    List<RequestEntity> findAllByAlbum(@NotNull String album);
    List<RequestEntity> findAllBySinger(@NotNull String singer);
    List<RequestEntity> findAllByGenre(@NotNull String genre);

    List<RequestEntity> findAllByGenreAndCompleted(@NotNull String genre, @NotNull Boolean completed);

    List<RequestEntity> findAllByComposition(@NotNull String composition);
    List<RequestEntity> findAllByDate(@NotNull Instant date);
    List<RequestEntity> findAllByCompleted(boolean completed);
    List<RequestEntity> findAllByCompletedAndDate(boolean completed, @NotNull Instant date);
}
