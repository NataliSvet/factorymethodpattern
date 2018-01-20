package factorymethod;

public class ArtistSelector {
    // фабричный метод, который создает нужнного артиста

    public Artist getArtist(ArtistsType artistsType) {
        Artist artist = null;
        switch (artistsType) {
            case THEATER:
                artist = new DramaticArtist();
                break;
            case CINEMA:
                artist = new MovieActor();
                break;
            case CIRCUS:
                artist = new Clown();
                break;
        }
        return artist;
    }
}
