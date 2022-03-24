package repository;

import model.entity.GenreEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenreRepository {
    private final Map<Integer, GenreEntity> storage = new HashMap<>();
    public GenreEntity findById(Integer id){
        return storage.get(id);
    }
    public List<GenreEntity> getAll(){
        return new ArrayList<>(storage.values());
    }
}
