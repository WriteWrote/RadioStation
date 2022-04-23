package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.FullRequestRecordDto;
import vsu.radstat.repository.RequestRepository;
import vsu.radstat.validator.RecordRequestValidator;

@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;

    private final RecordRequestValidator requestValidator;

    public void createRequest(FullRequestRecordDto dto) throws Exception {
        if (requestValidator.validate(dto)){
            throw new RuntimeException();
        }

        RequestEntity requestEntity = new RequestEntity();

        requestEntity.setAuthor(dto.getAuthor());
        requestEntity.setAlbum(dto.getAlbum());
        requestEntity.setSinger(dto.getSinger());
        requestEntity.setComposition(dto.getComposition());

        requestEntity.setCompleted(false);

        requestRepository.insert(requestEntity);
    }
}
