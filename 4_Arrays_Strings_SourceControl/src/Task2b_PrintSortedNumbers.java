
import java.util.Scanner;

public class Task2b_PrintSortedNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Amount of elements: ");
        int elementsAmount = scan.nextInt();
        int[] arr = new int[elementsAmount];
        
        for (int row = 0; row < elementsAmount; row++) {
            System.out.print("Value for element" + (row + 1) + " ");
            arr[row] = scan.nextInt();
        }

        //Selection sort
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            // loop through remaining numbers - store lowest
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        for (int row = 0; row < arr.length; row++) {
            System.out.print(arr[row] + " ");
        }
    }
}
