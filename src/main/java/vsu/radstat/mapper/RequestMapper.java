package vsu.radstat.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.FullRequestRecordDto;

import java.time.LocalDate;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RequestMapper {
    @Mapping(target = "record_name", source = "composition")
    @Mapping(target = "author_name", source = "authorName")
    @Mapping(target = "album_name", source = "albumName")
    @Mapping(target = "singer_name", source = "singerName")
    FullRequestRecordDto fromEntity(RequestEntity entity);

    @Mapping(target = "composition", source = "record_name")
    @Mapping(target = "authorName", source = "author_name")
    @Mapping(target = "albumName", source = "album_name")
    @Mapping(target = "singerName", source = "singer_name")
    RequestEntity toEntity(FullRequestRecordDto dto);

    List<FullRequestRecordDto> fromEntities(Iterable<RequestEntity> entities);
}
