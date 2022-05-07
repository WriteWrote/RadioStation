package vsu.radstat.mapper;

import org.mapstruct.Mapper;
import vsu.radstat.model.entity.AlbumEntity;
import vsu.radstat.model.input.addon.AlbumDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlbumMapper {
    AlbumDto fromEntity(AlbumEntity entity);

    List<AlbumDto> fromEntities(Iterable<AlbumEntity> entities);

    AlbumEntity toEntity(AlbumDto dto);
}
