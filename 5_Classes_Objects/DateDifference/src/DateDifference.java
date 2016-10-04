
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SwiftDate firstDate = new SwiftDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        SwiftDate secoundDate = new SwiftDate(sc.nextInt(), sc.nextInt(), sc.nextInt());

        if ((firstDate.year < secoundDate.year)
                || ((firstDate.year == secoundDate.year) && firstDate.month < secoundDate.month)
                || ((firstDate.year == secoundDate.year) && (firstDate.month == secoundDate.month)
                && (firstDate.day < secoundDate.day))) {

            System.out.println(firstDate.getDaysDifference(secoundDate) + " Last day included");

        } else {
            System.out.println(secoundDate.getDaysDifference(firstDate) + " Last day included");
        }
        
        firstDate.printInfo();
        secoundDate.printInfo();

    }
}
