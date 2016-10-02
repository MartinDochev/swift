
import java.util.Scanner;

public class Task1b_PrintMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert number rows cols");
        int martix = scan.nextInt();
        int[][] arr = new int[martix][martix];
        int count = 1;
        for (int row = 0; row < arr.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < arr.length; col++) {

                    arr[col][row] = count;
                    count++;
                }
            } else {

                for (int col = arr.length - 1; col >= 0; col--) {
                    arr[col][row] = count;
                    count++;
                }

            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
