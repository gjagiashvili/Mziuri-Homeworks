import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String fileName = "src/vefxistyaosani.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ სიტყვა, რომლის მოძებნა გვინდა: ");
        String searchWord = scanner.nextLine();
        boolean foundWord = false;

        try (BufferedReader br = new BufferedReader(
                new FileReader(fileName)
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(searchWord)) {
                    foundWord = true;
                    break;
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        if (foundWord) {
            System.out.println("სიტყვა " + searchWord + " ნაპოვნია ფაილში.");
        } else {
            System.out.println("სიტყვა " + searchWord + " არ მოიძებნა.");
        }
    }
}
