
import java.util.Scanner;

public class Task1d_PrintAllDivisors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert number");
        int inputNumber = scan.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
