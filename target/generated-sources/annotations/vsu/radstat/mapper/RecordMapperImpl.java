package vsu.radstat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vsu.radstat.model.entity.RecordEntity;
import vsu.radstat.model.input.addon.RecordDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-11T15:47:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class RecordMapperImpl implements RecordMapper {

    @Override
    public RecordDto fromEntity(RecordEntity entity) {
        if ( entity == null ) {
            return null;
        }

        RecordDto recordDto = new RecordDto();

        recordDto.setRecordName( entity.getRecordName() );
        recordDto.setYear( entity.getYear() );
        recordDto.setTime( entity.getTime() );

        return recordDto;
    }

    @Override
    public List<RecordDto> fromEntities(Iterable<RecordEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RecordDto> list = new ArrayList<RecordDto>();
        for ( RecordEntity recordEntity : entities ) {
            list.add( fromEntity( recordEntity ) );
        }

        return list;
    }

    @Override
    public RecordEntity toEntity(RecordDto dto) {
        if ( dto == null ) {
            return null;
        }

        RecordEntity recordEntity = new RecordEntity();

        recordEntity.setRecordName( dto.getRecordName() );
        recordEntity.setYear( dto.getYear() );
        recordEntity.setTime( dto.getTime() );

        return recordEntity;
    }
}
