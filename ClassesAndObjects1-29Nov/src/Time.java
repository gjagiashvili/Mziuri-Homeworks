public class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void displayTime() {
        System.out.print(hours + ":" +  minutes + ":" + seconds);
    }
}
