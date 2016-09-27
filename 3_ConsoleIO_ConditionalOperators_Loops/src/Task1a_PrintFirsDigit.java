
import java.util.Scanner;

public class Task1a_PrintFirsDigit {

    public static void main(String[] args) {
        System.out.println("Insert number");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        int firstDigit = 0;
        int numberLenght = String.valueOf(inputNumber).length(); // get numbers lenght.

        while (inputNumber != 0) {
            firstDigit = inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("The first digit of your number is" + firstDigit);
    }

}
