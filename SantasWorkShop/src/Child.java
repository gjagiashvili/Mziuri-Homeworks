import java.util.ArrayList;
import java.util.List;

public class Child {
    private String name;
    private int behaviorScore;
    private List<String> wishList;

    public Child(String name, int behaviorScore) {
        this.name = name;
        this.behaviorScore = behaviorScore;
        this.wishList = new ArrayList<>();
    }

    public int getBehaviorScore() {
        return behaviorScore;
    }

    public void addWish(String wish) {
        wishList.add(wish);
    }

    @Override
    public String toString() {
        return "ბავშვის სახელი: " + name + " behaviour score: " + behaviorScore + " wishlist: " + wishList;
    }
}