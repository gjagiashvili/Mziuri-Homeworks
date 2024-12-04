public class Power {
    private int base, exponent;

    Power(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    int calculatePower(int currentExponent) {
        if (currentExponent == 0) {
            return 1;
        }
        return base * calculatePower(currentExponent - 1);
    }

    int getResult() {
        return calculatePower(exponent);
    }
}
