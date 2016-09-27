
import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert arrays length");
        short arrLength = scan.nextShort();
        int[] arrElements = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Fill the element: " + (i + 1));
            arrElements[i] = scan.nextInt();
        }
        for (int i = 0; i < arrLength; i++) { // loops and prints the array elements backwards
            if (arrElements[i] % 2 == 0) {
                System.out.print(arrElements[i] + " ");
            }
        }
    }
}
