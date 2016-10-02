
import java.util.Scanner;

public class Task3f_LongestCommonSubstring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert 2 string to compare ");
        String firstText = scan.nextLine();
        String secoundText = scan.nextLine();

        int firstLength = firstText.length();
        int secoundLength = secoundText.length();

        int[][] arr = new int[firstLength + 1][secoundLength + 1];
        int len = 0, pos = -1;

        for (int row = 1; row < firstLength + 1; row++) {
            for (int col = 1; col < secoundLength + 1; col++) {
                if (firstText.charAt(row - 1) == secoundText.charAt(col - 1)) {
                    arr[row][col] = arr[row - 1][col - 1] + 1;
                    if (arr[row][col] > len) {
                        len = arr[row][col];
                        pos = row;
                    }
                } else {
                    arr[row][col] = 0;
                }
            }

        }
        System.out.print(firstText.substring(pos - len, pos));
    }
}
