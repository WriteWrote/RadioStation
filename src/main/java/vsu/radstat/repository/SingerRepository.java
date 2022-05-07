package vsu.radstat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.SingerEntity;

import java.util.List;

@Repository
public interface SingerRepository extends CrudRepository<SingerEntity, Integer>, JpaRepository<SingerEntity, Integer> {
    SingerEntity findBySingerId(Integer singerId);
    SingerEntity findBySingerName(String singerName);

    @Override
    List<SingerEntity> findAll();
}
