package vsu.radstat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;
import vsu.radstat.service.impl.ProgramService;

@RestController
@RequestMapping("/program")
@RequiredArgsConstructor
public class ProgramController {
    private final ProgramService programService;

    @GetMapping("/create")
    public OutputProgramDto createProgram(@RequestBody RequestProgramDto dto){
        return programService.createProgram(dto);
    }
}
