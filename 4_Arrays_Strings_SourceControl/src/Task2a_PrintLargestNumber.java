
import java.util.Arrays;
import java.util.Scanner;

public class Task2a_PrintLargestNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int elements = scan.nextInt();
        int[] arr = new int[elements];

        for (int row = 0; row < elements; row++) {
            System.out.printf("Insert value for %d element: ", row + 1);
            arr[row] = scan.nextInt();

        }

        //Arrays.sort(arr); 
        //Bubble sort method 
        for (int row = elements - 1; row >= 0; row--) {
            for (int col = 1; col <= row; col++) {
                if (arr[col - 1] > arr[col]) {
                    int temp = arr[col - 1];
                    arr[col - 1] = arr[col];
                    arr[col] = temp;

                }
            }
        }

        System.out.print("The bigges number is: " + arr[elements - 1]);

    }
}
