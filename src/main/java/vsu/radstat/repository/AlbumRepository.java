package vsu.radstat.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.AlbumEntity;

import java.util.List;
import java.util.Optional;

// jpa == crud
@Repository
public interface AlbumRepository extends CrudRepository<AlbumEntity, Integer>, JpaRepository<AlbumEntity,Integer> {
    AlbumEntity findByName(@NotNull String name);
    //@Query("select a from AlbumEntity a where a.id = ?1")
//    Optional<AlbumEntity> findById(@NotNull Integer id);

    //AlbumEntity findByAlbumId(@NotNull Integer albumId);
    //AlbumEntity findByAlbumName(@NotNull String albumName);

    @Override
    List<AlbumEntity> findAll();
}
