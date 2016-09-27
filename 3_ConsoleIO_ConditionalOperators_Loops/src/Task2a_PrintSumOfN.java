
import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int insertNumber; // Variable for the inserted numbers.
        int sumResult = 0; // Variable for the sum of all inserted numbers
        do { // loop for summing the numbers
            System.out.println("Insert numbers you want to sum. Type 0 to exit");
            insertNumber = scan.nextInt();
            sumResult += insertNumber;
        } while (insertNumber != 0);// loops until zero input
        System.out.println("Result: " + sumResult);
    }
}
