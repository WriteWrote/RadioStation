package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input_dto.request.RequestProgramDto;
import vsu.radstat.model.output_dto.OutputProgramDto;
import vsu.radstat.repository.ProgramRepository;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class ProgramService {
    private final ProgramRepository programRepository;

    public OutputProgramDto createProgram(RequestProgramDto dto) {
        //private List<RecordEntity> records;

        OutputProgramDto output = new OutputProgramDto();

        // todo: actual logic

        return output;
    }
}
