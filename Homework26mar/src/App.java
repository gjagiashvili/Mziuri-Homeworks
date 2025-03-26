import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    static List<Employee> employeeList = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployees();

        System.out.println("Employees whose name starts with A");
        employeeList.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .forEach(employee -> System.out.println(employee.getFirstName() + " " + employee.getLastName()));

        List<Employee> employeesJoinedIn2023 = employeeList.stream()
                .filter(emp -> emp.getId().startsWith("2023"))
                .toList();
        System.out.println("Employees who joined in 2023");
        employeesJoinedIn2023.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));

        employeeList.sort(Comparator.comparing(Employee::getFirstName).thenComparingInt(Employee::getSalary));

        System.out.println("Sorted Employees");
        employeeList.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " - " + emp.getSalary()));
    }
}
