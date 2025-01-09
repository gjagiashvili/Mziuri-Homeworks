public class Car {
    private String manufacturer;
    private String model;
    private String licensePlate;

    public Car(String manufacturer, String model, String licensePlate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public void printCarInfo() {
        System.out.println("მწარმოებელი: " + manufacturer);
        System.out.println("მოდელი: " + model);
        System.out.println("სახელმწიფო ნომერი: " + licensePlate);
    }

    class Engine {
        private String fuelType;
        private int cylinders;
        private int mileage;

        public Engine(String fuelType, int cylinders, int mileage) {
            this.fuelType = fuelType;
            this.cylinders = cylinders;
            this.mileage = mileage;
        }

        public int getMileage() {
            return mileage;
        }

        public void printEngineInfo() {
            System.out.println("ძრავის ტიპი: " + fuelType);
            System.out.println("ცილინდრების რაოდენობა: " + cylinders);
            System.out.println("მაქსიმალური კმ რაოდენობა: " + mileage + " კმ");
        }
    }
}
