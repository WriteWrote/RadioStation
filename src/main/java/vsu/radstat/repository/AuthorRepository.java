package vsu.radstat.repository;

import vsu.radstat.model.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorRepository {
    private final Map<Integer, AuthorEntity> storage = new HashMap<>();

    public AuthorEntity findById(Integer id) {
        return storage.get(id);
    }

    public AuthorEntity findByName(String name){
        return storage.values().stream()
                .filter(x -> name.equals(x.getAuthorName()))
                .findFirst()
                .orElse(null);
    }

    public List<AuthorEntity> getAll() {
        return new ArrayList<>(storage.values());
    }

    public void insert(AuthorEntity entity) throws Exception {
        if (storage.containsKey(entity.getAuthorId())) {
            throw new Exception("Already has this author");

        }
        storage.put(entity.getAuthorId(), entity);
    }

}
