
import java.util.Scanner;

public class Task3c_PrintChristmasTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimensions = scan.nextInt();
        int stump = (dimensions - 1) * 2 + 1;
        for (int i = 0; i < dimensions - 2; i++) {
            
            for (int j = 0; j < dimensions - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");

            }
            
            System.out.println("");
        }

        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < dimensions - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }

        System.out.println("");

    }

}
