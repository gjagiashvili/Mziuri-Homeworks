import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ სახელი, გვარი, ასაკი (გამოყავით enter-ით)");
        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();

        Human person1 = new Human(firstName, lastName, age);
        person1.walk();

        Human person2 = new Human("გიო", "ჯაღიაშვილი", 16);
        person1.hangOut(person2);

    }
}