import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<Artist> artists;
    private ArrayList<Album> albums;
    private ArrayList<Music> songs;

    public MusicLibrary() {
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void addSong(Music music) {
        songs.add(music);
    }

    public Music searchMusic(String title) {
        for (Music song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public Music giveRandomMusic() {
        if (songs.isEmpty()) return null;
        int randomIndex = (int) (Math.random() * songs.size());
        return songs.get(randomIndex);
    }
}