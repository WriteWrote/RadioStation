package repository;

import model.entity.GenreEntity;

import java.util.HashMap;
import java.util.Map;

public class GenreRepository {
    private Map<Integer, GenreEntity> storage = new HashMap<>();
    public GenreEntity findById(Integer id){
        return storage.get(id);
    }
}
