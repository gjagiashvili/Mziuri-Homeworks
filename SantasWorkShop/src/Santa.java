import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }

    public void addChildToList(Child child) {
        childrenList.add(child);
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> niceChildren = new ArrayList<>();
        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                niceChildren.add(child);
            }
        }
        return niceChildren;
    }

    public void deliverGifts() {
        System.out.println("სანტას მიაქვს საჩუქრები");
    }

    @Override
    public void spreadJoy() {
        System.out.println("სანტა ავრცელებს სიხარულს");
    }

    @Override
    public void singCarols() {
        System.out.println("სანტა მღერის სიმღერებს");
    }

    @Override
    public void decorateTree() {
        System.out.println("სანტა რთავს ნაძვის ხეს");
    }
}