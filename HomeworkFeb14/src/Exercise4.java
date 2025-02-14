import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise4 {
    public static void main(String[] args) {
        String fileName = "src/english_poem.txt";
        String text = """
                Assure polite his real and other figures though. Day age advantages
                and sufficient eating expression traveling. Of on am father by agreed
                supply rather either. Own handsome delicate property mistresses her
                end appetite. Mean are sons too sold nor said. Son share three men
                power by you. Now merits wonder effect garret own.
                """;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text.toUpperCase());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
