import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello", "Goodbye", "Goodbye", "Breakfast", "Dinner", "School"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Count: " + wordCount);

        Student student1 = new Student("00001", "Gio", "Jagiashvili");
        Student student2 = new Student("00008", "Lasha", "Antadze");

        student1.addGrade("Math", 10);
        student1.addGrade("Math", 9);
        student1.addGrade("English", 10);
        student1.addGrade("English", 10);


        student2.addGrade("Math", 2);
        student2.addGrade("Math", 10);
        student2.addGrade("English", 6);
        student2.addGrade("English", 10);

        System.out.println(student1);
        System.out.println(student2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Collections.sort(students);
        System.out.println("Sort by Average Grade: " + students);

        students.sort(new StudentLastNameComparator());
        System.out.println("Sort by Last Name: " + students);
    }
}