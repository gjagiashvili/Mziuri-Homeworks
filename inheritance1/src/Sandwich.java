public class Sandwich extends Product {
    private double length;

    public Sandwich(double price, String expirationDate, double length) {
        super(price, expirationDate);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
