package vsu.radstat.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.RequestDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RequestMapper {

    @Mapping(target = "composition", source = "composition")
    @Mapping(target = "author", source = "author")
    @Mapping(target = "album", source = "album")
    @Mapping(target = "singer", source = "singer")
    @Mapping(target = "genre", source="genre")
    @Mapping(target = "date", source = "date")
    RequestDto fromEntity(RequestEntity entity);

    @Mapping(target = "composition", source = "composition")
    @Mapping(target = "author", source = "author")
    @Mapping(target = "album", source = "album")
    @Mapping(target = "singer", source = "singer")
    @Mapping(target = "genre", source="genre")
    @Mapping(target = "date", source = "date")
    RequestEntity toEntity(RequestDto dto);

    List<RequestDto> fromEntities(Iterable<RequestEntity> entities);
}
