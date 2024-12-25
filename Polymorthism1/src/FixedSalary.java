public class FixedSalary extends Employee {
    private double salary;

    public FixedSalary(String name, String surname, String phone, double salary) {
        super(name, surname, phone);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}