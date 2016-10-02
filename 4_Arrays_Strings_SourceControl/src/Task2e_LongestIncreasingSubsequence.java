
import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {

    public static void main(String[] args) {

        System.out.print("Amount of elements");
        Scanner scan = new Scanner(System.in);
        int arrLength = scan.nextInt();
        int arr[] = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int maxLength = 0;
        int arrIndex = 0;

        for (int row = 1; row < arr.length; row++) {
            int length = 1;
            while (arr[row - 1] < arr[row]) {
                length++;
                row++;
                if (row == arr.length) {
                    break;
                }
            }
            if (maxLength < length) {
                maxLength = length;
                arrIndex = row - maxLength;
            }
        }
        for (int row = arrIndex; row < maxLength + arrIndex; row++) {
            System.out.print(arr[row] + " ");
        }

    }
}
