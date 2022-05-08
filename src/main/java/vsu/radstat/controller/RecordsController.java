package vsu.radstat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vsu.radstat.model.input.addon.RecordDto;
import vsu.radstat.service.impl.AddonsService;

import java.util.List;

@RestController
@RequestMapping("/add")
public class RecordsController {
    private final AddonsService service;

    @Autowired
    public RecordsController(AddonsService service) {
        this.service = service;
    }

    @PostMapping("/record")
    public RecordDto createRecord(RecordDto dto){
        return service.createRecord(dto);
    }
    @GetMapping("/record/{recordId}")
    public RecordDto getRecord(@PathVariable Integer id){

    }

    @GetMapping("/records")
    public List<RecordDto> getAllRecords(){

    }
}
