import java.util.Scanner;

public class Homework1 {
    public static void runTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ პირველი რიცხვი: ");
        int num1 = scanner.nextInt();
        System.out.print("შეიყვანეთ მეორე რიცხვი: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("შედეგი: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}
