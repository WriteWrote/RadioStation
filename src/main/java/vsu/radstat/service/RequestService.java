package vsu.radstat.service;

import lombok.RequiredArgsConstructor;
import vsu.radstat.repository.RequestRepository;

@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;
}
