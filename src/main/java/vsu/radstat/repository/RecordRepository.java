package vsu.radstat.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.RecordEntity;

import java.util.List;

@Repository
public interface RecordRepository extends CrudRepository<RecordEntity, Integer>, JpaRepository<RecordEntity, Integer> {
    RecordEntity findByRecordId(@NotNull Integer recordId);
    RecordEntity findByComposition(@NotNull String composition);

    @Override
    List<RecordEntity> findAll();

    List<RecordEntity> findAllByAuthorId(@NotNull Integer authorId);

    List<RecordEntity> findAllBySingerId(@NotNull Integer singerId);

    List<RecordEntity> findAllByAlbumId(@NotNull Integer albumId);

    List<RecordEntity> findAllByGenreId(@NotNull Integer genreId);

    List<RecordEntity> findAllByYear(@NotNull Integer year);

    List<RecordEntity> findAllByTimeLessThan(@NotNull Double time);

    List<RecordEntity> findAllByTimeBetween(@NotNull Double time, @NotNull Double time2);

    List<RecordEntity> findAllByRatingGreaterThan(@NotNull Double rating);

    List<RecordEntity> findAllByRatingBetween(@NotNull Double rating, @NotNull Double rating2);

}
