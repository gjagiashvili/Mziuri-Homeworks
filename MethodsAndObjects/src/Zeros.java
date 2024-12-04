public class Zeros {
    private int number;

    Zeros(int number) {
        this.number = number;
    }


    int countZeros(int currentNumber) {
        if (currentNumber == 0) {
            return 0;
        }
        if (currentNumber % 10 == 0) {
            return 1 + countZeros(currentNumber / 10);
        }
        return countZeros(currentNumber / 10);
    }

    void evenOdd() {
        int zeroAmt = countZeros(Math.abs(number));
        if (zeroAmt % 2 == 0) {
            System.out.println("ამ რიცხვში არის " + zeroAmt + " ნული, რაც ლუწია");
        } else {
            System.out.println("ამ რიცხვში არის " + zeroAmt + " ნული, რაც კენტია");
        }
    }
}
