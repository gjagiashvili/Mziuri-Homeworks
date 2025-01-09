public class Main {
    public static void main(String[] args) {
        University university = new University(true, "თსუ", 10);
        university.printUniversityInfo();

        University.Student student = university.new Student("გიო", "ჯაღიაშვილი", 15, "0123456789", 100, 3);
        student.printStudentInfo();


        System.out.println();


        Car[] cars = new Car[3];

        cars[0] = new Car("ტოიოტა", "პრიუსი", "PR-123-RR");
        Car.Engine engine1 = cars[0].new Engine("ჰიბრიდი", 4, 200000);

        cars[1] = new Car("ტესლა", "მოდელ S", "GA-123-AG");
        Car.Engine engine2 = cars[1].new Engine("ელექტრო", 0, 12);

        cars[2] = new Car("რეინჯ როვერი", "სპორტი", "GHI-789");
        Car.Engine engine3 = cars[2].new Engine("დიზელი", 4, 300000);

        int maxRange = 0;
        Car maxRangeCar = null;
        Car.Engine maxRangeEngine = null;

        for (int i = 0; i < cars.length; i++) {
            Car.Engine currentEngine;
            if (i == 0) {
                currentEngine = engine1;
            } else if (i == 1) {
                currentEngine = engine2;
            } else {
                currentEngine = engine3;
            }

            if (currentEngine.getMileage() > maxRange) {
                maxRange = currentEngine.getMileage();
                maxRangeCar = cars[i];
                maxRangeEngine = currentEngine;
            }
        }

        if (maxRangeCar != null && maxRangeEngine != null) {
            System.out.println("მანქანა ყველაზე მაღალი კმ-ით: ");
            maxRangeCar.printCarInfo();
            maxRangeEngine.printEngineInfo();
        }

        System.out.println();

        Computer computer = new Computer("ამერიკა", "apple", 999, true);
        computer.displayComputerInfo();

        Computer.Monitor monitor = computer.new Monitor(23, "high", 1000);
        monitor.displayMonitorInfo();

        Computer.Motherboard motherboard = computer.new Motherboard(4, "ddr1", 3200);
        motherboard.displayMotherboardInfo();

        System.out.println();

        Notification smsNotification = new Notification("გიო", "ანა", "გამარჯობა") {
            @Override
            public void send() {
                System.out.println(getSender() + " წერს '" + getMessageText() + "' ");
            }
            @Override
            public void receive() {
                System.out.println("ეს წერილი მიუვიდა " + getReceiver() + "-ს");
            }
        };

        smsNotification.send();
        smsNotification.receive();

        System.out.println();

        Library library = new Library(3213111, "თბილისის ბიბლიოთეკა");
        Library.Book book = library.new Book(922, "ვეფხისტყაოსანი");
        library.printInfo();
        book.printBookInfo();
    }
}
