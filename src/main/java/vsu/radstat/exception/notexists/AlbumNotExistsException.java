package vsu.radstat.exception.notexists;

public class AlbumNotExistsException extends RuntimeException{
    private final Integer albumId;

    public AlbumNotExistsException(Integer albumId) {
        super(String.format("Album %d not exists", albumId));
        this.albumId = albumId;
    }

    public Integer getAlbumId(){
        return albumId;
    }
}
