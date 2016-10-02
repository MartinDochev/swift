
import java.util.Scanner;

public class Task1d_PrintMatrix {

    public static void main(String args[]) {
        System.out.println("Enter The Value For N :");

        Scanner scan = new Scanner(System.in);

        int elements = scan.nextInt();

        int[][] arr = new int[elements][elements];

        int value = 1;

        int minCol = 0;

        int maxCol = elements - 1;

        int minRow = 0;

        int maxRow = elements - 1;

        while (value <= elements * elements) {
            for (int col = minCol; col <= maxCol; col++) {
                arr[minRow][col] = value;

                value++;
            }

            for (int row = minRow + 1; row <= maxRow; row++) {
                arr[row][maxCol] = value;

                value++;
            }

            for (int col = maxCol - 1; col >= minCol; col--) {
                arr[maxRow][col] = value;

                value++;
            }

            for (int row = maxRow - 1; row >= minRow + 1; row--) {
                arr[row][minCol] = value;

                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }

        for (int[] arr1 : arr) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr1[col] + " \t");
            }
            System.out.println();
        }
    }
}
