package vsu.radstat.service;

import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;

import javax.validation.Valid;
import java.time.Instant;
import java.util.List;

public interface IProgramService {
    public OutputProgramDto createProgram(@Valid RequestProgramDto dto);
    public OutputProgramDto findByProgramId(Integer id);
    public List<OutputProgramDto> findAllByDate(Instant date);
    public List<OutputProgramDto> findAllByLengthBetween(Integer l1, Integer l2);
}
