public class Cake extends Product{
    private double weight;

    public Cake(double price, String expirationDate, double weight) {
        super(price, expirationDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
