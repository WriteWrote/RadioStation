package vsu.radstat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vsu.radstat.model.entity.ProgramEntity;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input.addon.RecordDto;
import vsu.radstat.model.input.request.RequestProgramDto;
import vsu.radstat.model.responce.OutputProgramDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-11T15:47:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class ProgramMapperImpl implements ProgramMapper {

    @Override
    public OutputProgramDto fromEntity(ProgramEntity entity) {
        if ( entity == null ) {
            return null;
        }

        OutputProgramDto outputProgramDto = new OutputProgramDto();

        outputProgramDto.setLength( entity.getLength() );
        outputProgramDto.setDate( entity.getDate() );
        outputProgramDto.setRecords( recordEntityListToRecordDtoList( entity.getRecords() ) );

        return outputProgramDto;
    }

    @Override
    public ProgramEntity toEntity(RequestProgramDto dto) {
        if ( dto == null ) {
            return null;
        }

        ProgramEntity programEntity = new ProgramEntity();

        programEntity.setLength( dto.getLength() );
        programEntity.setDate( dto.getDate() );

        return programEntity;
    }

    @Override
    public List<OutputProgramDto> fromEntities(Iterable<ProgramEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<OutputProgramDto> list = new ArrayList<OutputProgramDto>();
        for ( ProgramEntity programEntity : entities ) {
            list.add( fromEntity( programEntity ) );
        }

        return list;
    }

    protected RecordDto recordEntityToRecordDto(RecordEntity recordEntity) {
        if ( recordEntity == null ) {
            return null;
        }

        RecordDto recordDto = new RecordDto();

        recordDto.setRecordName( recordEntity.getRecordName() );
        recordDto.setYear( recordEntity.getYear() );
        recordDto.setTime( recordEntity.getTime() );

        return recordDto;
    }

    protected List<RecordDto> recordEntityListToRecordDtoList(List<RecordEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RecordDto> list1 = new ArrayList<RecordDto>( list.size() );
        for ( RecordEntity recordEntity : list ) {
            list1.add( recordEntityToRecordDto( recordEntity ) );
        }

        return list1;
    }
}
