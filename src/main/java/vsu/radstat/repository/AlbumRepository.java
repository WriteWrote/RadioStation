package vsu.radstat.repository;

import vsu.radstat.model.entity.AlbumEntity;
import vsu.radstat.model.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumRepository {
    private final Map<Integer, AlbumEntity> storage = new HashMap<>();

    public AlbumEntity findById(Integer id) {
        return storage.get(id);
    }

    public AlbumEntity findByName(String name){
        return storage.values().stream()
                .filter(x -> name.equals(x.getAlbumName()))
                .findFirst()
                .orElse(null);
    }

    public List<AlbumEntity> getAll() {
        return new ArrayList<>(storage.values());
    }

    public void insert(AlbumEntity entity) throws Exception {
        if (storage.containsKey(entity.getAlbumId())) {
            throw new Exception("Already has this album");

        }
        storage.put(entity.getAlbumId(), entity);
    }
}
