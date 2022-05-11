package vsu.radstat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vsu.radstat.model.input.request.RequestDto;
import vsu.radstat.service.impl.ProgramService;
import vsu.radstat.service.impl.RequestService;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/add")
@RequiredArgsConstructor
public class RequestController {
    private final RequestService service;

    @PostMapping("request")
    public RequestDto createRequest(@RequestBody RequestDto dto){
        return service.createRequest(dto);
    }

    @GetMapping("request/{requestId}")
    public RequestDto getRequest(@PathVariable Integer requestId){
        return service.findByRequestId(requestId);
    }

    @GetMapping("/requests")
    public List<RequestDto> getAllRequests(){
        return service.findAll();
    }

    @GetMapping("/requests/{date}")
    public List<RequestDto> getAllCompletedForDate(@PathVariable String date){
        //return service.findAllCompletedByDate((Instant) date);
        return null;
    }
}
