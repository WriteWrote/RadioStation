package vsu.radstat.repository;

import vsu.radstat.model.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorRepository {
    private final Map<Integer, AuthorEntity> storage = new HashMap<>();

    public AuthorEntity findById(Integer id){
        return storage.get(id);
    }
    public List<AuthorEntity> getAll(){
        return new ArrayList<>(storage.values());
    }
}
