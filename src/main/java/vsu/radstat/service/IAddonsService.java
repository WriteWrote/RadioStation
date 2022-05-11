package vsu.radstat.service;

import jakarta.validation.constraints.NotNull;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input.addon.*;

import javax.validation.Valid;
import java.util.List;

public interface IAddonsService {
    public SimpleAddon create(@Valid SimpleAddon dto);

    public SimpleAddon findById(Integer id);

    public SimpleAddon findByName(String name);

    public List<SimpleAddon> findAll();
}
