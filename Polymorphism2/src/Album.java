import java.util.ArrayList;

public class Album {
    private String name;
    private int releaseYear;
    private ArrayList<Music> musics;

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new ArrayList<>();
    }

    public void addMusic(Music music) {
        musics.add(music);
    }

    public void removeMusic(Music music) {
        musics.remove(music);
    }

    public void displayInfo() {
        System.out.println("ალბომი " + name + ", გამოვიდა " + releaseYear + " წელს");
        for (Music music : musics) {
            music.displayInfo();
        }
    }

    public ArrayList<Music> getMusics() {
        return musics;
    }

    @Override
    public String toString() {
        return name;
    }
}
