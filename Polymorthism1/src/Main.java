import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //სავარჯიშო 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("n-კუთხედის გვერდების რაოდენობა: ");
        int sides = scanner.nextInt();
        System.out.print("n-კუთხედის გვერდების სიგრძე: ");
        double sideLength = scanner.nextDouble();

        RegularShape shape = new RegularShape(sides, sideLength);
        System.out.println("n-კუთხედის პერიმეტრი: " + shape.calculatePerimeter());

        System.out.print("კვადრატის გვერდის სიგრძე : ");
        double squareSideLength = scanner.nextDouble();
        Square square = new Square(squareSideLength);
        System.out.println("კვადრატის პერიმეტრი: " + square.calculatePerimeter());

        System.out.print("სამკუთხედის გვერდის სიგრძე: ");
        double triangleSideLength = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleSideLength);

        System.out.println("სამკუთხედისპერიმეტრი: " + triangle.calculatePerimeter());

        //სავარჯიშო 2 - ფიგურები
        Triangle2 triangle2 = new Triangle2(3, 4, 5);
        Rectangle rectangle = new Rectangle(4, 6);
        triangle2.printDetails();
        rectangle.printDetails();

        //სავარჯიშო 3 - თოჯინა
        Car toyCar = new Car(2, 20, 4, 50);
        Doll doll = new Doll(30, 40, 20);
        System.out.println("მანქანის სათამშოს ფასი: " + toyCar.calculatePrice());
        System.out.println("თოჯინას ფასი: " + doll.calculatePrice());

        //სავარჯიშო 4 - employee
        FixedSalary fixedsalary = new FixedSalary("ნათია", "გვარი", "123", 229);
        DailySalary dailysalary = new DailySalary("გიო", "ჯაღიაშვილი", "333", 10, 900);
        System.out.println("ფიქსირებული ხელფასი: " + fixedsalary.calculateSalary());
        System.out.println("დღიური ხელფასი (დღე * დღის ხელფასი): " + dailysalary.calculateSalary());

        //სავარჯიშო 5 - მანქანა

        // Task 5
        Car2 car = new Car2();
        car.start();
        car.left();
        car.right();
        car.stop();

    }
}