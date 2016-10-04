
import java.util.Arrays;
import java.util.Scanner;

public class Task2d_PrintSplitIndex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Insert amount of numbers: ");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        int leftSum = 0, rightSum = 0; 
        for (int row = 0; row < arrLength; row++) { 
            arr[row] = scan.nextInt();
        }

        for (int row = 0; row < arrLength - 1; row++) {     // loop of leftSum
            leftSum += arr[row];
            for (int col = row + 1; col < arrLength; col++) {   // loop for rightSum
                rightSum += arr[col]; 

            }
            if (leftSum == rightSum) { 
                System.out.print(row); // prints the possition (not array index)
                break;
            } else if (leftSum != rightSum && row == arrLength - 2) { // checks the array if end reached 
                System.out.print("No");

            }
            rightSum = 0;
        }

    }

    // System.out.print(Arrays.toString(arr));
}
