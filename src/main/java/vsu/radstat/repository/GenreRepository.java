package vsu.radstat.repository;

import vsu.radstat.exception.exists.GenreAlreadyExistsException;
import vsu.radstat.model.entity.GenreEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenreRepository {
    private final Map<Integer, GenreEntity> storage = new HashMap<>();

    public GenreEntity findById(Integer id) {
        return storage.get(id);
    }

    public GenreEntity findByName(String name){
        return storage.values().stream()
                .filter(x -> name.equals(x.getGenreName()))
                .findFirst()
                .orElse(null);
    }

    public List<GenreEntity> getAll() {
        return new ArrayList<>(storage.values());
    }

    public void insert(GenreEntity entity) throws GenreAlreadyExistsException {
        if (storage.containsKey(entity.getGenreId())) {
            //throw new Exception("Already has this genre");
            throw new GenreAlreadyExistsException(entity.getGenreId());
        }
        storage.put(entity.getGenreId(), entity);
    }

}
