package task1_numbernotanumber;

import java.util.Scanner;

public class Task1_NumberNotANumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equalsIgnoreCase("END")) {

            try {

                Integer.parseInt(input);
                System.out.println("Number");

            } catch (NumberFormatException ex) {

                System.out.println("Not a number");

            }
            
            input = scan.nextLine();
        }
    }

}
