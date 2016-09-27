
import java.util.Scanner;

public class Task4b_PrintCountOfWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert sentence: ");
        String sentence = scan.nextLine();
        byte numberWords = 1;
        char[] charArr = sentence.toCharArray();
        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == ' ') {
                numberWords += 1;
            }
        }
        System.out.println("Number of words: " + numberWords);
    }
}
