public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object obj) {
        Fraction fraction = (Fraction) obj;
        if (this.hashCode() != fraction.hashCode()) {
            return false;
        }
        if (numerator * fraction.denominator == denominator * fraction.numerator) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numerator + denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}