
import java.util.Scanner;

public class Task3c_CaesarCipher {

    public static void main(String[] arg) {

        System.out.print("Insert arr Length");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String operator = scan.nextLine();

        char[] arr = text.toCharArray();
        switch (operator) {
            case "encode":
                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] >= 'a' && arr[i] <= 'y') || (arr[i] >= 'A' && arr[i] <= 'Y')) {
                        arr[i] += 1;
                    } else if (arr[i] == 'z' || arr[i] == 'Z') {
                        arr[i] -= 25;
                    }
                }
                break;
            case "decode":
                for (int i = 0; i < arr.length; i++) {
                    if ((arr[i] >= 'b' && arr[i] <= 'z') || (arr[i] >= 'B' && arr[i] <= 'Z')) {
                        arr[i] -= 1;
                    } else if (arr[i] == 'a' || arr[i] == 'A') {
                        arr[i] += 25;
                    }
                }
                break;
            default:
                System.out.println("Error");
                break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
