package vsu.radstat.mapper;

import jakarta.validation.constraints.NotEmpty;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vsu.radstat.model.entity.ProgramEntity;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;

import java.util.List;

@Mapper(componentModel = "spring", uses = RecordMapper.class)
public interface ProgramMapper {
    //@Mapping(target = "genre_name", source = "genre")
    //@Mapping(target = "genre", ignore = true)
    OutputProgramDto fromEntity(ProgramEntity entity);

    //@Mapping(target = "genre_name", source = "genre")
    @Mapping(target = "records", ignore = true)
    ProgramEntity toEntity(RequestProgramDto dto);

    //do i need this?
//    @Mapping(target = "genre_name", source = "genre")
//    RequestEntity toEntity(OutputProgramDto dto);

    List<OutputProgramDto> fromEntities(Iterable<ProgramEntity> entities);
}
