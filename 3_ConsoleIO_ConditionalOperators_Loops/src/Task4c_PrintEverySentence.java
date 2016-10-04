
import java.util.Scanner;

public class Task4c_PrintEverySentence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert sentence: ");
        String sentence = scan.nextLine();
        char[] charArr = sentence.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i != 0){
                if (((charArr[i - 1] == '!') || (charArr[i - 1] == '?') || (charArr[i - 1] == '.')) 
                        && (charArr[i] != ' ')) {
               System.out.println();
            }else if (((charArr[i - 1] == '!') || (charArr[i - 1] == '?') || (charArr[i - 1] == '.'))
                    && charArr[i] == ' '){
                charArr[i] = '\n';
            }
            }
            
            System.out.print(charArr[i]);

        }

    }
}
