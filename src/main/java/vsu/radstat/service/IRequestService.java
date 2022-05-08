package vsu.radstat.service;

import vsu.radstat.model.input.request.FullRequestRecordDto;

import javax.validation.Valid;

public interface IRequestService {
    public FullRequestRecordDto createRequest(@Valid FullRequestRecordDto dto);
}
