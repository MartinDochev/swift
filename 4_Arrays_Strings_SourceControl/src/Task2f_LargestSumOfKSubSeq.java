
import java.util.Scanner;

public class Task2f_LargestSumOfKSubSeq {

    public static void main(String[] arg) {

        System.out.print("Insert arr Length and K:");
        Scanner scan = new Scanner(System.in);
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        int line = scan.nextInt();
        int arrIndex = 0;

        for (int row = 0; row < arr.length; row++) {
            arr[row] = scan.nextInt();
        }

        int maxSum = 0;
        for (int row = 0; row < arr.length - line; row++) {

            int sum = 0;

            for (int col = row; col < line + row; col++) {
                sum += arr[col];

            }
            if (sum > maxSum) {
                maxSum = sum;
                arrIndex = row;
            }
        }

        for (int i = arrIndex; i < arrIndex + line; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
