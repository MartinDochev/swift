
import java.util.Scanner;

public class Task1c_PrintMatrix {

    public static void main(String[] args) {

        System.out.print("Amount of elements");
        Scanner scan = new Scanner(System.in);
        int arrLength = scan.nextInt();
        int[][] arr = new int[arrLength][arrLength];

        int row = 1;
        int col = 1;
        for (int number = 1; number <= arrLength * arrLength; number++) {
            arr[row - 1][col - 1] = number;
            if ((row + col) % 2 == 0) {
                // Even stripes
                if (col < arrLength) {
                    col++;
                } else {
                    row += 2;
                }
                if (row > 1) {
                    row--;
                }
            } else {
                // Odd stripes
                if (row < arrLength) {
                    row++;
                } else {
                    col += 2;
                }
                if (col > 1) {
                    col--;
                }
            }
        }
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
