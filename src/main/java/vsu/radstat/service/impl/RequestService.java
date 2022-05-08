package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.RequestMapper;
import vsu.radstat.model.input.request.FullRequestRecordDto;
import vsu.radstat.repository.RequestRepository;
import vsu.radstat.service.IRequestService;

import javax.validation.Valid;
import java.util.Optional;

@Service
@Validated
@RequiredArgsConstructor
public class RequestService implements IRequestService {
    private final RequestRepository requestRepository;
    private final RequestMapper requestMapper;

    @Override
    public FullRequestRecordDto createRequest(@Valid FullRequestRecordDto dto) {
        return Optional.of(dto)
                .map(requestMapper::toEntity)
                .map(requestRepository::save)
                .map(requestMapper::fromEntity)
                .orElseThrow();
    }
}
