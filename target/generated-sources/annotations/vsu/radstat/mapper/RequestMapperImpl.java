package vsu.radstat.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import vsu.radstat.model.entity.RequestEntity;
import vsu.radstat.model.input.request.RequestDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-13T16:37:07+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
@Component
public class RequestMapperImpl implements RequestMapper {

    @Override
    public RequestDto fromEntity(RequestEntity entity) {
        if ( entity == null ) {
            return null;
        }

        RequestDto requestDto = new RequestDto();

        requestDto.setComposition( entity.getComposition() );
        requestDto.setAuthor( entity.getAuthor() );
        requestDto.setAlbum( entity.getAlbum() );
        requestDto.setSinger( entity.getSinger() );
        requestDto.setGenre( entity.getGenre() );
        requestDto.setDate( entity.getDate() );

        return requestDto;
    }

    @Override
    public RequestEntity toEntity(RequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        RequestEntity requestEntity = new RequestEntity();

        requestEntity.setComposition( dto.getComposition() );
        requestEntity.setAuthor( dto.getAuthor() );
        requestEntity.setAlbum( dto.getAlbum() );
        requestEntity.setSinger( dto.getSinger() );
        requestEntity.setGenre( dto.getGenre() );
        requestEntity.setDate( dto.getDate() );

        return requestEntity;
    }

    @Override
    public List<RequestDto> fromEntities(Iterable<RequestEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RequestDto> list = new ArrayList<RequestDto>();
        for ( RequestEntity requestEntity : entities ) {
            list.add( fromEntity( requestEntity ) );
        }

        return list;
    }
}
