
import java.util.Scanner;

public class Task4d_SumOfNumbersInString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your sentence");
        String sentence = scan.nextLine();
        int number = 0;
        int sum = 0;
        for (char charIndex : sentence.toCharArray()) {
            if (Character.getNumericValue(charIndex) > 0 && Character.getNumericValue(charIndex) <= 9) {
                number *= 10;
                number += Character.getNumericValue(charIndex);

            } else {
                sum += number;
                number = 0;
            }
        }
        System.out.println(sum);

    }

}
