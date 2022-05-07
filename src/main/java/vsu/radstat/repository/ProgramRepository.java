package vsu.radstat.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.ProgramEntity;

import java.time.Instant;
import java.util.List;

@Repository
public interface ProgramRepository extends CrudRepository<ProgramEntity, Integer>, JpaRepository<ProgramEntity, Integer> {
    @Override
    List<ProgramEntity> findAll();

    @Override
    List<ProgramEntity> findAllById(Iterable<Integer> integers);

    ProgramEntity findByProgramId(@NotNull Integer programId);

    List<ProgramEntity> findAllByLengthBetween(@NotNull Integer length, @NotNull Integer length2);

    List<ProgramEntity> findAllByDate(@NotNull Instant date);
}
