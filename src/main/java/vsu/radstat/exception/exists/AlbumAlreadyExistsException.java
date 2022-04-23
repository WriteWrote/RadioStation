package vsu.radstat.exception.exists;

public class AlbumAlreadyExistsException extends RuntimeException{
    private final Integer albumId;

    public AlbumAlreadyExistsException(Integer albumId) {
        super(String.format("Album %d already exists", albumId));
        this.albumId = albumId;
    }

    public Integer getAlbumId(){
        return albumId;
    }
}
