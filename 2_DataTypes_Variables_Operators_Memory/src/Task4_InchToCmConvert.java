
import java.util.Scanner;

public class Task4_InchToCmConvert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inch = scan.nextDouble();
        double cmResult = inch * 2.54;

        System.out.println(inch + " Inchs = " + (cmResult) + " Cantimeters");

    }
}
