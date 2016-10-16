
import java.util.Scanner;

public class Task1_PeoplePresentation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        do {

            if (input[0].equals("END")) {
                break;
            }

            String firstName = input[0];

            String lastName = input[1];

            switch (input.length) {

                case 4:

                    double weekSalary = Double.parseDouble(input[2]);

                    double workHoursPerDay = Double.parseDouble(input[3]);

                    Worker worker = new Worker(firstName, lastName, weekSalary, workHoursPerDay);

                    worker.printInfo();

                    break;

                case 5:

                    String facultyNumber = input[2];

                    int lectureCount = Integer.parseInt(input[3]);

                    int exerciseCount = Integer.parseInt(input[4]);

                    Student student = new Student(firstName, lastName, facultyNumber, lectureCount, exerciseCount);

                    student.printInfo();

                    break;

            }

            input = scan.nextLine().split(" ");

        } while (!(input[0]).equalsIgnoreCase("END"));

        scan.close();

    }
}
