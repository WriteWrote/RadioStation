package vsu.radstat.repository;

import vsu.radstat.model.entity.RecordEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RecordRepository {
    private final Map<Integer, RecordEntity> storage = new HashMap<>();

    public RecordEntity findById(Integer id) {
        return storage.get(id);
    }

    public List<RecordEntity> findAllByAuthorId(Integer id) {
        return storage.values().stream().filter(x -> id.equals(x.getAuthorId())).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllBySingerId(Integer id) {
        return storage.values().stream().filter(x -> id.equals(x.getSingerId())).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllByAlbumId(Integer id) {
        return storage.values().stream().filter(x -> id.equals(x.getAlbumId())).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllByYear(Integer year) {
        return storage.values().stream().filter(x -> year.equals(x.getYear())).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllLesserThanTime(Double time) {
        return storage.values().stream().filter(x -> time >= x.getTime()).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllGreaterThanTime(Double time) {
        return storage.values().stream().filter(x -> time <= x.getTime()).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllBetweenTimes(Double time1, Double time2) {
        return storage.values().stream().filter(x -> x.getTime() >= time1 && x.getTime() <= time2).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllGreaterThanRating(Double rating) {
        return storage.values().stream().filter(x -> rating <= x.getRating()).collect(Collectors.toList());
    }

    public List<RecordEntity> findAllBetweenRatings(Double rating1, Double rating2) {
        return storage.values().stream().filter(x -> x.getTime() >= rating1 && x.getTime() <= rating2).collect(Collectors.toList());
    }

    public void insert(RecordEntity entity) throws Exception {
        if (storage.containsKey(entity.getRecordId())) {
            throw new Exception("Already has this album");

        }
        storage.put(entity.getRecordId(), entity);
    }

}
