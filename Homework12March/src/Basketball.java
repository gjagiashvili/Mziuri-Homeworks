public class Basketball implements Comparable<Basketball> {
    String firstName, lastName;
    int points, rebounds, blocks, assists, loses;

    public Basketball(String firstName, String lastName, int points, int rebounds, int blocks, int assists, int loses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.loses = loses;
    }

    public double getRating() {
        return points + rebounds + blocks * 2 + assists * 1.5 - loses * 2;
    }

    @Override
    public int compareTo(Basketball otherPlayer) {
        return Double.compare(otherPlayer.getRating(), this.getRating());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " Rating: " + getRating();
    }
}