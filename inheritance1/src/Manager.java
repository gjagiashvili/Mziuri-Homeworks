public class Manager extends Employee {
    private String managerId;

    public Manager(String firstName, String lastName, int age, String employeeId, String managerId) {
        super(firstName, lastName, age, employeeId);
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
}
