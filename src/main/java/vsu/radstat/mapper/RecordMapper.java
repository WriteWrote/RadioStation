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
    // Todo: set ignore for this and map handcrafted
    @Mapping(target = "authorName", ignore = true)//source = "author_name")
    @Mapping(target = "singerName", ignore = true)//source = "singer_name")
    @Mapping(target = "albumName", ignore = true)//source = "album_name")
    RecordDto fromEntity(RecordEntity entity);

    List<RecordDto> fromEntities(Iterable<RecordEntity> entities);

    // do i need this?
    // @Mapping(target = "record_id", ignore = true)

    @Mapping(target = "authorId", ignore = true)//, source = "authorName")
    @Mapping(target = "singerId", ignore = true)//, source = "singerName")
    @Mapping(target = "albumId", ignore = true)//source = "albumName")
    RecordEntity toEntity(RecordDto dto);
}
