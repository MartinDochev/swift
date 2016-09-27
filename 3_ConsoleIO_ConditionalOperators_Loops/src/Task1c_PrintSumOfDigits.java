
import java.util.Scanner;

public class Task1c_PrintSumOfDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert number");
        int inputNumber = scan.nextInt();
        int numbersSum = 0;

        while (inputNumber != 0) {
            numbersSum += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("The sum is: " + numbersSum);
    }

}
