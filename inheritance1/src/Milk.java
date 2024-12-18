public class Milk extends Product{
    private double volume;

    public Milk(double price, String expirationDate, double volume) {
        super(price, expirationDate);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
