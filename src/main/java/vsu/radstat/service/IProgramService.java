package vsu.radstat.service;

import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;

import javax.validation.Valid;

public interface IProgramService {
    public OutputProgramDto createProgram(@Valid RequestProgramDto dto);
}
