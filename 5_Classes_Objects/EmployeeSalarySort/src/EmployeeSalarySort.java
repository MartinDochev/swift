
import java.util.Scanner;

public class EmployeeSalarySort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int empAmount = scan.nextInt();

        scan.nextLine();
        String name;
        double salary;
        String position;
        String department;
        int age;
        String email;

        for (int i = 0; i < empAmount; i++) {
            String input = scan.nextLine();
            String[] inputIndex = input.split(", ");

            if (inputIndex.length <= 4) {
                name = inputIndex[0];
                salary = Double.parseDouble(inputIndex[1]);
                position = inputIndex[2];
                department = inputIndex[3];

                Employee newEmp = new Employee(name, salary, position, department);
                Employee.addEmployee(newEmp);
            } else if (inputIndex.length == 5) {
                if (inputIndex[4].length() <= 2) {
                    name = inputIndex[0];
                    salary = Double.parseDouble(inputIndex[1]);
                    position = inputIndex[2];
                    department = inputIndex[3];
                    age = Integer.parseInt(inputIndex[4]);

                    Employee newEmp = new Employee(name, salary, position, department, age);
                    Employee.addEmployee(newEmp);

                } else {
                    name = inputIndex[0];
                    salary = Double.parseDouble(inputIndex[1]);
                    position = inputIndex[2];
                    department = inputIndex[3];
                    email = inputIndex[4];

                    Employee newEmp = new Employee(name, salary, position, department, email);
                    Employee.addEmployee(newEmp);
                }
            } else if (inputIndex.length == 6) {
                name = inputIndex[0];
                salary = Double.parseDouble(inputIndex[1]);
                position = inputIndex[2];
                department = inputIndex[3];
                age = Integer.parseInt(inputIndex[4]);
                email = inputIndex[5];

                Employee newEmp = new Employee(name, salary, position, department, age, email);
                Employee.addEmployee(newEmp);
            }

        }
        scan.close();
        Employee.sortEmployee(Employee.employee);
        for (int i = 0; i < 3; i++) {
            if (Employee.employee[i].email != null) {
                System.out.println(Employee.employee[i].name
                        + ", " + Employee.employee[i].position + ", "
                        + Employee.employee[i].department + ", " + Employee.employee[i].email);
            } else {
                System.out.println(Employee.employee[i].name
                        + ", " + Employee.employee[i].position + ", "
                        + Employee.employee[i].department);
            }
        }
        scan.close();

    }

}
