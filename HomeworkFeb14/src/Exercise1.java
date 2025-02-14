import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) {
        String fileName = "src/vefxistyaosani.txt";
        String text = """
                შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,
                კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;
                კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,
                ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.
                """;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
