
import java.util.Scanner;

public class Task3a_PrintSquare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimensions = scan.nextInt();

        for (int i = 1; i <= dimensions; i++) { // loop for the cols
            for (int j = 1; j <= dimensions; j++) { // loop for the rows
                if ((i == 1) || (i == dimensions)
                        || (j == 1) || (j == dimensions)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
