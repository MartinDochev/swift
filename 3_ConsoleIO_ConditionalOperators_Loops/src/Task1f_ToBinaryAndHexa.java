
import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {

    public static void main(String[] args) {

        System.out.println("Inser number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); // Number from console
        String result = "";
        int inputNumber = number; // Backup for the consol number
        while (inputNumber > 0) { // convert to binary loop
            if (inputNumber % 2 == 0) {
                result += '0';

            } else {

                result += '1';

            }
            inputNumber /= 2;
        }
        String binaryResult = new StringBuilder(result).reverse().toString(); // mirrors the result
        System.out.println("Binary: " + binaryResult);
        int temp = 0;
        String hexResult = "";
        inputNumber = number; // sets the console value 
        while (inputNumber != 0) { // hexadecimal loop
            temp = inputNumber % 16;
            switch (temp) {
                case 0:
                    hexResult += '0';
                    break;
                case 1:
                    hexResult += '1';
                    break;
                case 2:
                    hexResult += '2';
                    break;
                case 3:
                    hexResult += '3';
                    break;
                case 4:
                    hexResult += '4';
                    break;
                case 5:
                    hexResult += '5';
                    break;
                case 6:
                    hexResult += '6';
                    break;
                case 7:
                    hexResult += '7';
                    break;
                case 8:
                    hexResult += '8';
                    break;
                case 9:
                    hexResult += '9';
                    break;
                case 10:
                    hexResult += "A";
                    break;
                case 11:
                    hexResult += "B";
                    break;
                case 12:
                    hexResult += "C";
                    break;
                case 13:
                    hexResult += "D";
                    break;
                case 14:
                    hexResult += "E";
                    break;
                case 15:
                    hexResult += "F";
                    break;
                default:
                    System.out.print("Error");
                    break;
            }
            inputNumber /= 16;
        }
        hexResult = new StringBuilder(hexResult).reverse().toString(); // mirrors the 
        System.out.println("Hexadecimal: " + hexResult);
    }
}
