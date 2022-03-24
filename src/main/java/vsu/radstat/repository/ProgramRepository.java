package vsu.radstat.repository;

import vsu.radstat.model.entity.ProgramEntity;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgramRepository {
    private final Map<Integer, ProgramEntity> storage = new HashMap<>();
    public ProgramEntity findById(Integer id){
        return storage.get(id);
    }
    public List<ProgramEntity> findAllByGenreId(Integer id){
        return storage.values().stream().filter(x -> id.equals(x.getGenreId())).collect(Collectors.toList());
    }

    public List<ProgramEntity> findAllBetweenLength(Double len1, Double len2){
        return storage.values().stream().filter(x -> x.getLength() >= len1 && x.getLength()<=len2).collect(Collectors.toList());
    }
    public List<ProgramEntity> findAllByDate(LocalDate date){
        return storage.values().stream().filter(x -> date.equals(x.getDate().toLocalDate())).collect(Collectors.toList());
    }
}
