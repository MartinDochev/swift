
import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert ammount of numbers: ");
        int amount = scan.nextInt();
        int insertNumber; // Variable for the inserted numbers.
        int sumResult = 0; // Variable for the sum of all inserted numbers
        do { // loop for summing the numbers
            System.out.print("Insert numbers you want to sum: ");
            insertNumber = scan.nextInt();
            sumResult += insertNumber;
            amount--;
        } while (amount > 0);// loops until zero input
        System.out.println("Result: " + sumResult);
    }
}
