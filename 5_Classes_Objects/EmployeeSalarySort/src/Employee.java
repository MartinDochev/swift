
import java.util.Scanner;

public class Employee {

    String name;
    double salary;
    String position;
    String department;

    int age;
    String email;

    static Employee[] employee = new Employee[15];
    static int employeeCount = 0;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, int age, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }

    static void addEmployee(Employee newEmployee) {
        employee[employeeCount] = newEmployee;
        employeeCount++;
    }

    static void sortEmployee(Employee[] employee) {
        for (int row = 1; row < employee.length; row++) {
            for (int col = 0; col < employee.length - row; col++) {
                if (employee[col + 1] != null) {
                    if (employee[col].salary < employee[col + 1].salary) {
                        Employee temp = employee[col];
                        employee[col] = employee[col + 1];
                        employee[col + 1] = temp;
                    }
                } else {
                    break;
                }

            }
        }
    }

}
