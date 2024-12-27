public class Main {
    public static void main(String[] args) {
        Music song1 = new Music("სიმღერა 1", 3, "პოპი");
        Music song2 = new Music("სიმღერა 2", 4, "როკი");
        Music song3 = new Music("სიმღერა 3", 2, "ჯაზი");

        Album album1 = new Album("ალბომი 1", 2021);
        album1.addMusic(song1);
        album1.addMusic(song2);

        Artist artist = new Artist("გიო ჯაღიაშვილი");
        artist.addAlbum(album1);

        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist);
        library.addAlbum(album1);
        library.addSong(song3);

        artist.displayInfo();
        Music foundSong = library.searchMusic("სიმღერა1");
        if (foundSong != null) {
            foundSong.play();
        } else {
            System.out.println("სიმღერა ვერ მოიძებნა ამ ალბომში. ");
        }

        System.out.println("რანდომ სიმღერა:");
        Music randomSong = library.giveRandomMusic();
        if (randomSong != null) {
            randomSong.displayInfo();
            randomSong.play();
        } else {
            System.out.println("სიმღერა ვერ მოიძებნა.");
        }
    }
}
