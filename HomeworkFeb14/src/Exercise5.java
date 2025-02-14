import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {
        String file1 = "src/vefxistyaosani.txt";
        String file2 = "src/english_poem.txt";
        String mergedFile = "src/merged.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile));
             BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            bw.write("პირველი ფაილი:\n");
            String line;
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            bw.newLine();
            bw.write("მეორე ფაილი:\n");
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
