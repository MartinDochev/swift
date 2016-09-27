
import java.util.Scanner;

public class Task2_LeapYearCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert year: ");
        short leapYear = scan.nextShort();
        boolean leapFlag;

        leapFlag = ((leapYear % 4 == 0) && (leapYear % 100 != 0)
                || (leapYear % 4 == 0) && (leapYear % 100 == 0)
                && (leapYear % 400 == 0));
        System.out.println("Leap Year? " + leapFlag);
    }

}
