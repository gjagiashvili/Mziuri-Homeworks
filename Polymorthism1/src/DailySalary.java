public class DailySalary extends Employee {
    private int workedDays;
    private double dailyRate;

    public DailySalary(String name, String surname, String phone, int workedDays, double dailyRate) {
        super(name, surname, phone);
        this.workedDays = workedDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateSalary() {
        return workedDays * dailyRate;
    }
}