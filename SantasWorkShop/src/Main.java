import java.util.List;

public class Main {
    public static void main(String[] args) {

        Santa santa = new Santa("საბა", "სანტა კლაუსი", 85);

        Child child1 = new Child("გიო", 7);
        child1.addWish("ლეგო");
        child1.addWish("სათამაშო მანქანა");

        Child child2 = new Child("ანა", 4);
        child2.addWish("თოჯინა");

        Child child3 = new Child("ლიზი", 9);
        child3.addWish("ველოსიპეტი");

        santa.addChildToList(child1);
        santa.addChildToList(child2);
        santa.addChildToList(child3);


        List<Child> niceChildren = santa.checkNaughtyOrNiceList();
        System.out.println("კარგი ბავშვები: " + niceChildren);

        santa.deliverGifts();

        Elf elf = new Elf("ჯიჯი", "ელფი", 50, 10, "სათამაშოების გამკეთებელი");
        elf.makeToy();
        elf.wrapGifts();
        elf.celebrateChristmas();
        elf.hostChristmasParty();
        System.out.println(elf);


        Reindeer reindeer = new Reindeer("რუდოლფი", 12, 30, "წითელი");
        reindeer.fly();
        System.out.println("Fitness: " + reindeer.checkFitnessLevel());
        System.out.println(reindeer);

        Snowman snowman = new Snowman(5.5, "ლურჯი", false);
        snowman.decorate("შარფი");
        snowman.decorate("სტაფილო");
        snowman.melt();
        System.out.println(snowman);

        santa.spreadJoy();
        santa.singCarols();
        santa.decorateTree();
    }
}
