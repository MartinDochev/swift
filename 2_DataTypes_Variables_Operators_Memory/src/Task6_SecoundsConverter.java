
import java.util.Scanner;

public class Task6_SecoundsConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert secounds: ");
        int secounds = scan.nextInt();
        int days = secounds / 86400;
        secounds %= 86400;
        int hours = secounds / 3600;
        secounds %= 3600;
        int minutes = secounds / 60;
        secounds %= 60;
        System.out.println(days + " Days " + hours + " Hours "
                + minutes + " Minutes " + secounds + " Secounds.");
    }
}
