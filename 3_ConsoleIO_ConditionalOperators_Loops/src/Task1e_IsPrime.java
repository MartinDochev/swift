
import java.util.Scanner;

public class Task1e_IsPrime {

    public static void main(String[] args) {
        System.out.println("Insert number");
        Scanner scan = new Scanner(System.in);
        int primeNumber = scan.nextInt();
        boolean isPrime = false;
        int count = 0;
        for (int i = 1; i <= primeNumber; i++) {
            if ((primeNumber % i == 0) && (count <= 2)) {
                count += 1;
                isPrime = true;
            } else if (count > 2) {
                isPrime = false;
                break;
            }

        }
        System.out.println("Is this number prime? " + isPrime);
    }
}
