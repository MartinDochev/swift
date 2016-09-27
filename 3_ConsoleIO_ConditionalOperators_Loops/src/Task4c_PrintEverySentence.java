
import java.util.Scanner;

public class Task4c_PrintEverySentence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert sentence: ");
        String sentence = scan.nextLine();
        char[] charArr = sentence.toCharArray();
        for (int i = 0; i < charArr.length - 1; i++) {
            if ((charArr[i] == '!') || (charArr[i] == '?') || (charArr[i] == '.')) {
                charArr[i + 1] = '\n';
            }
            System.out.print(charArr[i]);

        }

    }
}
