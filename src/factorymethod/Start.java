package factorymethod;

public class Start {

    public static void main(String[] args) {

       ArtistSelector artistSelector = new ArtistSelector();

        Artist artist = artistSelector.getArtist(ArtistsType.THEATER);
        artist.display();
        artist.play_a_role();
        artist.stop_a_role();


        artist = artistSelector.getArtist(ArtistsType.CINEMA);
        artist.display();
        artist.play_a_role();
        artist.stop_a_role();

        artist = artistSelector.getArtist(ArtistsType.CIRCUS);
        artist.display();
        artist.play_a_role();
        artist.stop_a_role();

    }
}
