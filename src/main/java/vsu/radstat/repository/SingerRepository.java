package vsu.radstat.repository;

import vsu.radstat.model.entity.SingerEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingerRepository {
    private final Map<Integer, SingerEntity> storage = new HashMap<>();
    public SingerEntity findById(Integer id){
        return storage.get(id);
    }
    public List<SingerEntity> getAll(){
        return new ArrayList<>(storage.values());
    }
}
