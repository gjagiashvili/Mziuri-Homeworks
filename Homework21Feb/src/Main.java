
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    static String fileName = "countries.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter country " + (i + 1) + "'s name:");
            String name = scanner.nextLine();

            System.out.println("Enter country " + (i + 1) + "'s population:");
            int population = scanner.nextInt();

            System.out.println("Enter country " + (i + 1) + "'s area:");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }
        serializeCountries(countries);
        deserializeAndPrintCountries();
    }

    private static void serializeCountries(Country[] countries) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(countries);
            System.out.println("Countries added to: " + fileName);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void deserializeAndPrintCountries() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName)
        )) {
            Country[] countries = (Country[]) ois.readObject();
            System.out.println("Your countries:");
            for (Country country : countries) {
                System.out.println(country);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
