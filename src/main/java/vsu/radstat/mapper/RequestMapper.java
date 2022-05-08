package vsu.radstat.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.RequestDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RequestMapper {
    @Mapping(target = "record_name", source = "composition")
    @Mapping(target = "author_name", source = "authorName")
    @Mapping(target = "album_name", source = "albumName")
    @Mapping(target = "singer_name", source = "singerName")
    RequestDto fromEntity(RequestEntity entity);

    @Mapping(target = "composition", source = "record_name")
    @Mapping(target = "authorName", source = "author_name")
    @Mapping(target = "albumName", source = "album_name")
    @Mapping(target = "singerName", source = "singer_name")
    RequestEntity toEntity(RequestDto dto);

    List<RequestDto> fromEntities(Iterable<RequestEntity> entities);
}
