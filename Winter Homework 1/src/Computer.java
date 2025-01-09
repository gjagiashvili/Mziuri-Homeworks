public class Computer {
    private String manufacturerCountry;
    private String model;
    private double price;
    private boolean warranty;

    public Computer(String manufacturerCountry, String model, double price, boolean warranty) {
        this.manufacturerCountry = manufacturerCountry;
        this.model = model;
        this.price = price;
        this.warranty = warranty;
    }

    public void displayComputerInfo() {
        System.out.println("წარმოების ქვეყანა: " + manufacturerCountry);
        System.out.println("მოდელი: " + model);
        System.out.println("ფასი: " + price);
        System.out.println("გარანტია: " + (warranty ? "აქვს" : "არ აქვს"));
    }

    public class Monitor {
        private double diagonal;
        private String resolution;
        private int herts;

        public Monitor(double diagonal, String resolution, int herts) {
            this.diagonal = diagonal;
            this.resolution = resolution;
            this.herts = herts;
        }

        public void displayMonitorInfo() {
            System.out.println("დიაგონალი: " + diagonal);
            System.out.println("რეზოლუცია: " + resolution);
            System.out.println("ჰერცი: " + herts);
        }
    }

    public class Motherboard {
        private int slots;
        private String memoryType;
        private int fsbspeed;

        public Motherboard(int slots, String memoryType, int fsbspeed) {
            this.slots = slots;
            this.memoryType = memoryType;
            this.fsbspeed = fsbspeed;
        }

        public void displayMotherboardInfo() {
            System.out.println("სლოტები: " + slots);
            System.out.println("მეხსიერების ტიპი: " + memoryType);
            System.out.println("fsb speed: " + fsbspeed);
        }
    }
}
