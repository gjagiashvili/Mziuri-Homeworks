public class Car extends ToyFactory {
    private double cabinPrice;
    private double wheelPrice;
    private int wheelCount;
    private double otherExpenses;

    public Car(double cabinPrice, double wheelPrice, int wheelCount, double otherExpenses) {
        this.cabinPrice = cabinPrice;
        this.wheelPrice = wheelPrice;
        this.wheelCount = wheelCount;
        this.otherExpenses = otherExpenses;
    }

    @Override
    public double calculatePrice() {
        return cabinPrice + (wheelPrice * wheelCount) + otherExpenses;
    }
}
