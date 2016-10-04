
import java.util.Scanner;

public class Task4b_PrintCountOfWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert sentence: ");
        String sentence = scan.nextLine();
        int numberWords = 0;
        char[] charArr = sentence.toCharArray();
        for (int i = 0; i < charArr.length - 1; i++) {
            if (((charArr[i] >= 'a' && charArr[i] <= 'z')
                    || (charArr[i] >= 'A' && charArr[i] <= 'Z'))
                    && ((charArr[i + 1] == ' ') || (charArr[i + 1] == '.') || (charArr[i + 1] == ',')
                    || (charArr[i + 1] == '?') || (charArr[i + 1] == '!'))) {
                numberWords += 1;
            } else if ((i == charArr.length - 2)) {
                numberWords++;
            }
        }
        System.out.println("Number of words: " + numberWords);
    }
}
