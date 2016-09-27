
import java.util.Scanner;

public class Task3b_PrintZFigure {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimensions = scan.nextInt();

        for (int row = 1; row <= dimensions; row++) { // loop for the rows
            for (int col = 1; col <= dimensions; col++) { // loop for the cols
                if ((row == 1 || row == dimensions)
                        || (col + row - 1 == dimensions)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
