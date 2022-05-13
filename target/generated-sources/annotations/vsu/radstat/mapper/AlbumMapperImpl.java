package vsu.radstat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vsu.radstat.model.entity.AlbumEntity;
import vsu.radstat.model.input.addon.AlbumDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T09:50:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class AlbumMapperImpl implements AlbumMapper {

    @Override
    public AlbumDto fromEntity(AlbumEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AlbumDto albumDto = new AlbumDto();

        albumDto.setName( entity.getName() );

        return albumDto;
    }

    @Override
    public List<AlbumDto> fromEntities(Iterable<AlbumEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AlbumDto> list = new ArrayList<AlbumDto>();
        for ( AlbumEntity albumEntity : entities ) {
            list.add( fromEntity( albumEntity ) );
        }

        return list;
    }

    @Override
    public AlbumEntity toEntity(AlbumDto dto) {
        if ( dto == null ) {
            return null;
        }

        AlbumEntity albumEntity = new AlbumEntity();

        albumEntity.setName( dto.getName() );

        return albumEntity;
    }
}
