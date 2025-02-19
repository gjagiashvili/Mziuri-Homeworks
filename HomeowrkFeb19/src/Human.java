import java.util.Scanner;

public class Human {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void walk() {
        System.out.println(firstName + " სეირნობს");
    }

    public void hangOut(Human other) {
        System.out.println(this.firstName + " is hanging out with " + other.getFirstName());
    }


}