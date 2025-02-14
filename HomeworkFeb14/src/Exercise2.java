import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) {
        String fileName = "src/vefxistyaosani.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        System.out.println("სიტყვების რაოდენობა: " + wordCount);
    }
}
