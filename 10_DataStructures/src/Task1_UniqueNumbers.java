
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_UniqueNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        int input = scan.nextInt();

        for (int i = 0; i < input; i++) {

            set.add(scan.nextInt());

        }

        set.stream().forEach((i) -> {
            System.out.print(i + " ");
        });

    }
}
