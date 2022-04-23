package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.FullRequestDto;
import vsu.radstat.repository.RequestRepository;

@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;

    public void createRequest(FullRequestDto dto) throws Exception {
        // todo: insert validation of request here

        RequestEntity requestEntity = new RequestEntity();

        requestEntity.setAuthor(dto.getAuthor());
        requestEntity.setAlbum(dto.getAlbum());
        requestEntity.setSinger(dto.getSinger());
        requestEntity.setComposition(dto.getComposition());

        requestEntity.setCompleted(false);

        requestRepository.insert(requestEntity);
    }
}
