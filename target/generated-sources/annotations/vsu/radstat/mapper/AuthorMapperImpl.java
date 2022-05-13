package vsu.radstat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vsu.radstat.model.entity.AuthorEntity;
import vsu.radstat.model.input.addon.AuthorDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T09:50:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorDto fromEntity(AuthorEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setName( entity.getName() );

        return authorDto;
    }

    @Override
    public List<AuthorDto> fromEntities(Iterable<AuthorEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AuthorDto> list = new ArrayList<AuthorDto>();
        for ( AuthorEntity authorEntity : entities ) {
            list.add( fromEntity( authorEntity ) );
        }

        return list;
    }

    @Override
    public AuthorEntity toEntity(AuthorDto dto) {
        if ( dto == null ) {
            return null;
        }

        AuthorEntity authorEntity = new AuthorEntity();

        authorEntity.setName( dto.getName() );

        return authorEntity;
    }
}
