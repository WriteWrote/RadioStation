package vsu.radstat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vsu.radstat.model.entity.SingerEntity;
import vsu.radstat.model.input.addon.SingerDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T09:50:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class SingerMapperImpl implements SingerMapper {

    @Override
    public SingerDto fromEntity(SingerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SingerDto singerDto = new SingerDto();

        singerDto.setName( entity.getName() );

        return singerDto;
    }

    @Override
    public List<SingerDto> fromEntities(Iterable<SingerEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SingerDto> list = new ArrayList<SingerDto>();
        for ( SingerEntity singerEntity : entities ) {
            list.add( fromEntity( singerEntity ) );
        }

        return list;
    }

    @Override
    public SingerEntity toEntity(SingerDto dto) {
        if ( dto == null ) {
            return null;
        }

        SingerEntity singerEntity = new SingerEntity();

        singerEntity.setName( dto.getName() );

        return singerEntity;
    }
}
