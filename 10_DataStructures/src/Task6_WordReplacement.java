
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task6_WordReplacement {

    public static void main(String[] args) {
        Map<String, String> replace = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int pair = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < pair; i++) {

            String mapValues = scan.nextLine();

            String[] arrMap = mapValues.split(" ");

            replace.put((arrMap[0]).trim(), (arrMap[1]).trim());
        }

        String[] arrSentence = sentence.toLowerCase().split(" ");

        for (int i = 0; i < arrSentence.length; i++) {
            if (replace.containsKey(arrSentence[i])) {
                arrSentence[i] = replace.get(arrSentence[i]);
            }
            System.out.print(arrSentence[i] + " ");
        }

    }
}
