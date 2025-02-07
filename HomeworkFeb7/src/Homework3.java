public class Homework3 {
    public static void runTask() {
        int testNumber = -5;

        try {
            checkNumber(testNumber);
            System.out.println("რიცხვი დადებითია: " + testNumber);
        } catch (NegativeNumberException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }

    static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("რიცხვი უარყოფითია: " + number);
        }
    }
}
