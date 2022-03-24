package repository;

import model.entity.AlbumEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumRepository {
    private final Map<Integer, AlbumEntity> storage = new HashMap<>();
    public AlbumEntity findById(Integer id){
        return storage.get(id);
    }
    public List<AlbumEntity> getAll(){
        return new ArrayList<>(storage.values());
    }
}
