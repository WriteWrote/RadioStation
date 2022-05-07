package vsu.radstat.mapper;

import org.mapstruct.Mapper;
import vsu.radstat.model.entity.AuthorEntity;
import vsu.radstat.model.entity.GenreEntity;
import vsu.radstat.model.input.addon.AuthorDto;
import vsu.radstat.model.input.addon.GenreDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GenreMapper {
    GenreDto fromEntity(GenreEntity entity);

    List<GenreDto> fromEntities(Iterable<GenreEntity> entities);

    GenreEntity toEntity(GenreDto dto);
}
