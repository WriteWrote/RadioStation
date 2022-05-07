package vsu.radstat.mapper;

import org.mapstruct.Mapper;
import vsu.radstat.model.entity.AlbumEntity;
import vsu.radstat.model.entity.AuthorEntity;
import vsu.radstat.model.input.addon.AlbumDto;
import vsu.radstat.model.input.addon.AuthorDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDto fromEntity(AuthorEntity entity);

    List<AuthorDto> fromEntities(Iterable<AuthorEntity> entities);

    AuthorEntity toEntity(AuthorDto dto);
}
