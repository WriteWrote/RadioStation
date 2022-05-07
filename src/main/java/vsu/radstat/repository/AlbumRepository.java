package vsu.radstat.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.AlbumEntity;

import java.util.List;

@Repository
public interface AlbumRepository extends CrudRepository<AlbumEntity, Integer>, JpaRepository<AlbumEntity,Integer> {
    AlbumEntity findByAlbumId(@NotNull Integer albumId);
    AlbumEntity findByAlbumName(@NotNull String albumName);

    @Override
    List<AlbumEntity> findAll();
}
