
import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {

    public static void main(String[] arg) {

        System.out.print("Insert arr Length");
        Scanner scan = new Scanner(System.in);
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        
        for (int i = 0; i < arr.length - 1; i++) {
            
            int aloneNumber = 1;

            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] == arr[j + 1]) {
                    aloneNumber++;
                }

            }
            if (aloneNumber % 2 == 1) {
                System.out.print(arr[i]);
                break;
            }
            
        }

    }
}
