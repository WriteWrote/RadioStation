package vsu.radstat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.radstat.model.entity.AlbumEntity;

import java.util.List;

@Repository
public interface AlbumRepository extends CrudRepository<AlbumEntity, Integer>, JpaRepository<AlbumEntity,Integer> {
    AlbumEntity findByAlbumId(Integer albumId);
    AlbumEntity findByAlbumName(String albumName);

    @Override
    List<AlbumEntity> findAll();
}
