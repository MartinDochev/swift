
import java.util.Scanner;

public class Task4d_SumOfNumbersInString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your sentence");
        String sentence = scan.nextLine();
        char[] charIndex =  sentence.toCharArray();
        int number = 0;
        int sum = 0;
        for (int i = 0; i < charIndex.length;i++ ) {
            if (Character.getNumericValue(charIndex[i]) >= 0 && Character.getNumericValue(charIndex[i]) <= 9) {
                number *= 10;
                number += Character.getNumericValue(charIndex[i]);
                if ((i == charIndex.length - 1) && number != 0){
                    sum += number;
                    number = 0;
                }

            } else if ((i == charIndex.length - 1) 
                    || ((Character.getNumericValue(charIndex[i]) < 0) 
                    || (Character.getNumericValue(charIndex[i]) > 9))){
                sum += number;
                number = 0;
            }
        }
        System.out.println(sum);

    }

}
