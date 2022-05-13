package vsu.radstat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vsu.radstat.model.entity.GenreEntity;
import vsu.radstat.model.input.addon.GenreDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T09:50:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class GenreMapperImpl implements GenreMapper {

    @Override
    public GenreDto fromEntity(GenreEntity entity) {
        if ( entity == null ) {
            return null;
        }

        GenreDto genreDto = new GenreDto();

        genreDto.setName( entity.getName() );

        return genreDto;
    }

    @Override
    public List<GenreDto> fromEntities(Iterable<GenreEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<GenreDto> list = new ArrayList<GenreDto>();
        for ( GenreEntity genreEntity : entities ) {
            list.add( fromEntity( genreEntity ) );
        }

        return list;
    }

    @Override
    public GenreEntity toEntity(GenreDto dto) {
        if ( dto == null ) {
            return null;
        }

        GenreEntity genreEntity = new GenreEntity();

        genreEntity.setName( dto.getName() );

        return genreEntity;
    }
}
