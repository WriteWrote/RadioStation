package vsu.radstat.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vsu.radstat.model.entity.AuthorEntity;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input.addon.AuthorDto;
import vsu.radstat.model.input.addon.RecordDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecordMapper {
    @Mapping(target = "composition", source = "record_name")
    @Mapping(target = "authorName", source = "author_name")
    @Mapping(target = "singerName", source = "singer_name")
    @Mapping(target = "albumName", source = "album_name")
    RecordDto fromEntity(RecordEntity entity);

    List<RecordDto> fromEntities(Iterable<RecordEntity> entities);

    // do i need this?
    // @Mapping(target = "record_id", ignore = true)
    @Mapping(target = "record_name", source = "composition")
    @Mapping(target = "author_name", source = "authorName")
    @Mapping(target = "singer_name", source = "singerName")
    @Mapping(target = "album_name", source = "albumName")
    RecordEntity toEntity(RecordDto dto);
}
