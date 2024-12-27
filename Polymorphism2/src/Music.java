public class Music extends Playable {
    private String title;
    private double duration;
    private String genre;

    public Music(String title, double duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("ჩართულია: (play) " + title);
    }

    @Override
    public void stop() {
        System.out.println("გაჩერებულია: (stop) " + title);
    }

    public void displayInfo() {
        System.out.println("სათაური: " + title + ", ხანგრძლივობა: " + duration + ", ჟანრა: " + genre);
    }

    public String getTitle() {
        return title;
    }
}