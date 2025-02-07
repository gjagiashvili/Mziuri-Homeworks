public class Homework4 {
    public static void runTask() {
        double number = -9;

        try {
            double result = calculateSquareRoot(number);
            System.out.println("კვადრატული ფესვი: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception: " + e.getMessage());
        }
    }

    public static double calculateSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("რიცხვი უარყოფითია, კვადრატული ფესვი ვერ გამოითვლება: " + number);
        }
        return Math.sqrt(number);
    }
}
