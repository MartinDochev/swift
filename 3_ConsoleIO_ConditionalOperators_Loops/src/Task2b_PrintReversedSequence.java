
import java.util.Scanner;

public class Task2b_PrintReversedSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert arrays length");
        short arrLength = scan.nextShort();  // variable keeps the length of the array
        int[] arrElements = new int[arrLength];  // sets the array length
        for (int i = 0; i < arrLength; i++) {  // loops arrLength times to fill the array
            System.out.println("Fill the element: " + (i + 1));
            arrElements[i] = scan.nextInt();
        }

        for (int i = arrLength; i > 0; i--) { // loops and prints the array elements backwards
            System.out.print(arrElements[i - 1] + " ");
        }

    }

}
