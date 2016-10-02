
import java.util.Scanner;

public class Task3a_IsPalindrome {

    public static void main(String[] arg) {

        System.out.print("Insert word ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        char[] charArr = text.toCharArray();
        boolean palindrome = false;

        for (int i = 0; i < (charArr.length / 2) + 1; i++) {

            if (charArr[i] != charArr[(charArr.length - 1) - i]) {
                palindrome = false;
                break;
            }
            palindrome = true;
        }
        System.out.print(palindrome);

    }
}
