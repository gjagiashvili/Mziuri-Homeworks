import java.util.Scanner;
public class Homework2 {
    public static void runTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ რიცხვი სტრინგად: ");
        String input = scanner.nextLine();

        try {
            int num = Integer.parseInt(input);
            int result = num * 100;
            System.out.println("შედეგი: " + result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
