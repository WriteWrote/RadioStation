package vsu.radstat.repository;

import vsu.radstat.model.entity.RequestEntity;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RequestRepository {
    private final Map<Integer, RequestEntity> storage = new HashMap<>();

    public RequestEntity findById(Integer id) {
        return storage.get(id);
    }

    public List<RequestEntity> findAllByAuthor(String author) {
        return storage.values().stream().filter(x -> author.equals(x.getAuthor())).collect(Collectors.toList());
    }

    public List<RequestEntity> findAllByAlbum(String album) {
        return storage.values().stream().filter(x -> album.equals(x.getAlbum())).collect(Collectors.toList());
    }

    public RequestEntity findByCompositionName(String name) {
        return storage.values().stream()
                .filter(x -> name.equals(x.getComposition()))
                .findFirst()
                .orElse(null);
    }

    public List<RequestEntity> findAllByDate(LocalDate date) {
        return storage.values().stream().filter(x -> date.equals(x.getDate())).collect(Collectors.toList());
    }

    public void insert(RequestEntity entity) throws Exception {
        if (storage.containsKey(entity.getRequestId())) {
            throw new Exception("Already has this request");

        }
        storage.put(entity.getRequestId(), entity);
    }

    public boolean isCompleted(Integer id) {
        return storage.values().stream()
                .allMatch(x -> id.equals(x.getRequestId())
                        && Boolean.TRUE.equals(x.isCompleted()));
    }

    public List<RequestEntity> findAllUncompleted() {
        return storage.values().stream().filter(x -> Boolean.FALSE.equals(x.isCompleted())).collect(Collectors.toList());
    }

    public List<RequestEntity> findAllCompletedByDate(LocalDate date) {
        return storage.values().stream().filter(x -> Boolean.TRUE.equals(x.isCompleted()) &&
                        date.equals(x.getDate()))
                .collect(Collectors.toList());
    }
}
