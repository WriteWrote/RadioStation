package vsu.radstat.service;

import vsu.radstat.model.input.request.RequestDto;

import javax.validation.Valid;
import java.time.Instant;
import java.util.List;

public interface IRequestService {
    public RequestDto createRequest(@Valid RequestDto dto);

    public RequestDto findByRequestId(Integer id);

    public List<RequestDto> findAll();

    public List<RequestDto> findAllByAlbum(String name);

    public List<RequestDto> findAllByAuthor(String name);

    public List<RequestDto> findAllByGenre(String name);

    public List<RequestDto> findAllBySinger(String name);

    public List<RequestDto> findAllByComposition(String name);

    public List<RequestDto> findAllCompletedByDate(Instant date);

    public List<RequestDto> findAllByDate(Instant date);
}
