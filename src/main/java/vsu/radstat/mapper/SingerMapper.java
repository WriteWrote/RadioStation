package vsu.radstat.mapper;

import org.mapstruct.Mapper;
import vsu.radstat.model.entity.AuthorEntity;
import vsu.radstat.model.entity.SingerEntity;
import vsu.radstat.model.input.addon.AuthorDto;
import vsu.radstat.model.input.addon.SingerDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SingerMapper {
    SingerDto fromEntity(SingerEntity entity);

    List<SingerDto> fromEntities(Iterable<SingerEntity> entities);

    SingerEntity toEntity(SingerDto dto);
}
