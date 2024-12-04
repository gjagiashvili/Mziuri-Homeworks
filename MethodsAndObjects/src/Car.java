public class Car {
    String brand;
    String model;
    int year;
    String licensePlate;

    Car(String brand, String model, int year, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    void printInfo() {
        System.out.println("მარკა: " + brand + " მოდელი: " + model + " წელი: " + year + " სახ. ნომერი: " + licensePlate);
    }
}
