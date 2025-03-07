import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student> {
    private String id;
    public String firstName;
    public String lastName;
    private HashMap<String, ArrayList<Integer>> grades;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
    }

    void addGrade(String subject, int grade) {
        grades.putIfAbsent(subject, new ArrayList<>());
        grades.get(subject).add(grade);
    }

    public double getAverageGrade() {
        int gradesSum = 0;
        int gradesCount = 0;
        for (ArrayList<Integer> subjectGrades : grades.values()) {
            for (int grade : subjectGrades) {
                gradesSum += grade;
                gradesCount++;
            }
        }
        return gradesCount == 0 ? 0 : (double) gradesSum / gradesCount;
    }

    @Override
    public int compareTo(Student o) {
        double diff = this.getAverageGrade() - o.getAverageGrade();

        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                '}';
    }
}