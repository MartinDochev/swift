
import java.util.Scanner;

public class Task4a_StringWoVowels {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert sentence: ");
        String sentence = scan.nextLine();
        String consonantSentence = "";
        char[] charArr = sentence.toCharArray();
        for (int i = 0; i < charArr.length - 1; i++) {
            if ((charArr[i] == 'A') || (charArr[i] == 'a') || (charArr[i] == 'E')
                    || (charArr[i] == 'e') || (charArr[i] == 'I') || (charArr[i] == 'i')
                    || (charArr[i] == 'O') || (charArr[i] == 'o')
                    || (charArr[i] == 'U') || (charArr[i] == 'u')) {

            } else {
                consonantSentence += charArr[i];
            }
        }
        System.out.println("Consonant sentence: " + consonantSentence);
    }
}
