import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums;
    private ArrayList<Music> songs;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
        songs.addAll(album.getMusics());
        System.out.println("დაემატა ალბომი " + album + " მომღერალს " + name);
    }

    public void removeAlbum(Album album) {
        if (albums.remove(album)) {
            songs.removeAll(album.getMusics());
            System.out.println("ამოეშალა ალბომი" + album + " მომღერალს " + name);
        } else {
            System.out.println("ალბომი ვერ მოიძებნა მომღერალისთვის " + name);
        }
    }

    public void displayInfo() {
        System.out.println("მომღერალი: " + name);
        System.out.print("ალბომი:");
        for (Album album : albums) {
            album.displayInfo();
        }
    }
}