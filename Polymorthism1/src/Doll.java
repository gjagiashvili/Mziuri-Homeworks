public class Doll extends ToyFactory {
    private double hairPrice;
    private double clothingPrice;
    private double otherExpenses;

    public Doll(double hairPrice, double clothingPrice, double otherExpenses) {
        this.hairPrice = hairPrice;
        this.clothingPrice = clothingPrice;
        this.otherExpenses = otherExpenses;
    }

    @Override
    public double calculatePrice() {
        return hairPrice + clothingPrice + otherExpenses;
    }
}
