package vsu.radstat.mapper;

import org.mapstruct.Mapper;
import vsu.radstat.model.entity.AlbumEntity;
import vsu.radstat.model.entity.SimpleAddonEntity;
import vsu.radstat.model.input.addon.AlbumDto;
import vsu.radstat.model.input.addon.SimpleAddonDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SimpleAddonMapper {
    SimpleAddonDto fromEntity(SimpleAddonEntity entity);

    List<SimpleAddonDto> fromEntities(Iterable<SimpleAddonEntity> entities);

    SimpleAddonEntity toEntity(SimpleAddonDto dto);
}
