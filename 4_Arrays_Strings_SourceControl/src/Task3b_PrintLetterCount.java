
import java.util.Arrays;
import java.util.Scanner;

public class Task3b_PrintLetterCount {

    public static void main(String[] arg) {

        System.out.print("Insert arr Length");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String lowerCase = text.toLowerCase();
        char[] charArr = lowerCase.toCharArray();
        Arrays.sort(charArr);
        int count = 1;
        for (int i = 0; i < charArr.length - 1; i++) {

            if (charArr[i] == charArr[i + 1]) {

                count++;

            } else {

                System.out.println(charArr[i] + "(" + count + ")");
                count = 1;
            }

        }
    }
}
