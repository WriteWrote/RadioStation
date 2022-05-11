package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.RequestMapper;
import vsu.radstat.model.input.request.RequestDto;
import vsu.radstat.repository.RequestRepository;
import vsu.radstat.service.IRequestService;

import javax.validation.Valid;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@Validated
@RequiredArgsConstructor
public class RequestService implements IRequestService {
    private final RequestRepository requestRepository;
    private final RequestMapper requestMapper;

    @Override
    public RequestDto createRequest(@Valid RequestDto dto) {
        return Optional.of(dto)
                .map(requestMapper::toEntity)
                .map(requestRepository::save)
                .map(requestMapper::fromEntity)
                .orElseThrow();
    }

    @Override
    public RequestDto findByRequestId(Integer id) {
        return requestRepository.findById(id)
                .map(requestMapper::fromEntity)
                .orElse(null);
    }

    @Override
    public List<RequestDto> findAll() {
        return requestMapper.fromEntities(requestRepository.findAll());
    }

    @Override
    public List<RequestDto> findAllByAlbum(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByAlbum(name));
    }

    @Override
    public List<RequestDto> findAllByAuthor(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByAuthor(name));
    }

    @Override
    public List<RequestDto> findAllByGenre(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByGenre(name));
    }

    @Override
    public List<RequestDto> findAllBySinger(String name) {
        return requestMapper.fromEntities(requestRepository.findAllBySinger(name));
    }

    @Override
    public List<RequestDto> findAllByComposition(String name) {
        return requestMapper.fromEntities(requestRepository.findAllByComposition(name));
    }

    @Override
    public List<RequestDto> findAllCompletedByDate(Instant date) {
        return requestMapper.fromEntities(requestRepository.findAllByCompletedAndDate(true, date));
    }

    @Override
    public List<RequestDto> findAllByDate(Instant date) {
        return requestMapper.fromEntities(requestRepository.findAllByDate(date));
    }
}
