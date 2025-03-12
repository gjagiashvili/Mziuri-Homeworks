import java.util.*;public class Main {


    public static void main(String[] args) {
        ArrayList<Basketball> players = new ArrayList<>();
        players.add(new Basketball("Gio", "Jagiashvili", 98, 10, 2, 8, 3));
        players.add(new Basketball("Stephen", "Curry", 35, 5, 1, 10, 2));
        players.add(new Basketball("Luka", "Sordia", 99, 8, 3, 7, 4));

        Collections.sort(players);
        System.out.println("Players Rating (Descending): " + players);
        Collections.reverse(players);
        System.out.println("Players Rating (Ascending): " + players);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Gio", "Jagiashvili", new Date(2009 - 1900, Calendar.APRIL, 4), new ArrayList<>(Arrays.asList(100, 100, 10))));
        students.add(new Student("Ana", "Anashvili", new Date(2004, Calendar.DECEMBER, 15), new ArrayList<>(Arrays.asList(99, 99, 3))));

        System.out.println("Students: " + students);
        students.sort((student1, student2) -> student1.firstName.compareTo(student2.firstName));
        System.out.println("Students Lexicographically: " + students);
        students.sort((student1, student2) -> Double.compare(student2.getAverageGrade(), student1.getAverageGrade()));
        System.out.println("Students by Average Grade: " + students);
        students.sort((student1, student2) -> student1.birthDate.compareTo(student2.birthDate));
        System.out.println("Students by Birth Date: " + students);


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Prius", 2019, 9999, new Engine("Hybrid", 4, 2)));
        cars.add(new Car("Lexus", "LX", 2024, 80000, new Engine("Diesel", 6, 3)));
        cars.add(new Car("Tesla", "Model X", 2019, 60000, new Engine("Electric", 4, 0)));

        System.out.println("Cars Unsorted: " + cars);
        cars.sort((car1, car2) -> Integer.compare(car1.year, car2.year));
        System.out.println("Cars by Year: " + cars);
        cars.sort((car1, car2) -> Integer.compare(car1.mileage, car2.mileage));
        System.out.println("Cars by Mileage: " + cars);
        cars.sort((car1, car2) -> Double.compare(car1.engine.volume, car2.engine.volume));
        System.out.println("Cars Engine Volume: " + cars);
    }
}

