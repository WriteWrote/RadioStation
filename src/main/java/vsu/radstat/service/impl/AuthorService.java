package vsu.radstat.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import vsu.radstat.mapper.AuthorMapper;
import vsu.radstat.model.input.addon.SimpleAddon;
import vsu.radstat.repository.AuthorRepository;
import vsu.radstat.service.IAddonsService;

import java.util.List;
import java.util.Optional;

@Service
@Validated
@RequiredArgsConstructor
public class AuthorService implements IAddonsService {
    private final AuthorRepository authorRep;
    private final AuthorMapper authorMap;

    @Override
    public SimpleAddon create(SimpleAddon dto) {
        return Optional.of(dto)
                .map(authorMap::toEntity)
                .map(authorRep::save)
                .map(authorMap::fromEntity)
                .orElseThrow();
    }

    @Override
    public SimpleAddon findById(Integer id) {
        return null;
    }

    @Override
    public SimpleAddon findByName(String name) {
        return null;
    }

    @Override
    public List<SimpleAddon> findAll() {
        return null;
    }
}
