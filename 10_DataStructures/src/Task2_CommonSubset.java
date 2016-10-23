
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2_CommonSubset {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Set<Integer> firstSet = new HashSet();
        Set<Integer> secoundSet = new HashSet();

        int firstAmount = scan.nextInt();
        int secoundAmount = scan.nextInt();

        for (int i = 0; i < firstAmount; i++) {

            firstSet.add(scan.nextInt());

        }

        for (int i = 0; i < secoundAmount; i++) {

            secoundSet.add(scan.nextInt());
        }

        Set<Integer> common = new HashSet(firstSet);

        common.retainAll(secoundSet);

        if (common.isEmpty()) {

            System.out.println("NO");

        } else {

            common.stream().forEach((i) -> {

                System.out.print(i + " ");

            });
        }

    }
}
