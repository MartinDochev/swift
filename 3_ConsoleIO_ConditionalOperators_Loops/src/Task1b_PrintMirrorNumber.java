
import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number you want: ");
        int inputNumber = scan.nextInt();
        int result = 0;

        while (inputNumber != 0) {
            result *= 10;
            result += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("Mirror number: " + result);
    }
}
