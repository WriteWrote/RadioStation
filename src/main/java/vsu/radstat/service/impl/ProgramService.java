package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.ProgramMapper;
import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;
import vsu.radstat.repository.ProgramRepository;
import vsu.radstat.service.IProgramService;

import javax.validation.Valid;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Validated
@RequiredArgsConstructor
public class ProgramService implements IProgramService {
    private final ProgramRepository programRep;
    private final ProgramMapper programMap;

    @Override
    public OutputProgramDto createProgram(@Valid RequestProgramDto dto) {
        // made dto

        return null;
    }

    @Override
    public OutputProgramDto findByProgramId(Integer id) {
        return programMap.fromEntity(programRep.findByProgramId(id));
    }

    @Override
    public List<OutputProgramDto> findAllByDate(Instant date) {
        return programMap.fromEntities(programRep.findAllByDate(date));
    }

    @Override
    public List<OutputProgramDto> findAllByLengthBetween(Integer l1, Integer l2) {
        return programMap.fromEntities(programRep.findAllByLengthBetween(l1, l2));
    }
}
