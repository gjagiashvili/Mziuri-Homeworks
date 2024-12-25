abstract class Employee {
    protected String name;
    protected String surname;
    protected String phone;

    public Employee(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public abstract double calculateSalary();
}
