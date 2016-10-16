
public class Worker extends Person {

    double weekSalary;
    double workHoursPerDay;

    Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {

        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    void setWeekSalary(double weekSal) {

        if (weekSal < 0) {

            System.out.println("Expected positive number for week salary.");

        } else {

            this.weekSalary = weekSal;
        }
    }

    void setWorkHoursPerDay(double workHoursPerDay) {

        if (workHoursPerDay < 0) {

            System.out.println("Expected positive number for workHoursPerDay.");

        } else {

            this.workHoursPerDay = workHoursPerDay;
        }
    }

    public double getWeekSalary() {

        return weekSalary;

    }

    public void printInfo() {

        System.out.println("First name: " + this.firstName);

        System.out.println("Last name: " + this.lastName);

        System.out.println("Occupation: Worker");

        System.out.println("Week salary: " + this.weekSalary);

        System.out.printf("Hours per day: %.2f \n", this.workHoursPerDay);

        System.out.printf("Salary per hour: %.2f \n", this.weekSalary / (this.workHoursPerDay * 5.0));

    }
}
