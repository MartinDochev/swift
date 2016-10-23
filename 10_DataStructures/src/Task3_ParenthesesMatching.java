
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Task3_ParenthesesMatching {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Character> input = new ArrayDeque();
        Deque<Character> buffer = new ArrayDeque();
        String line = scan.nextLine();

        for (char c : line.toCharArray()) {
            if (c == '{' || c == '}' || c == '[' || c == ']' || c == '(' || c == ')') {

                input.add(c); // goes with poll
            } 

        }

        buffer.push(input.poll());

        for (int i = 0; i < line.length(); i++) {
            if (input.isEmpty()) {
                break;
            }
            if (input.peek() == '}' && !buffer.isEmpty()) {
                if (buffer.peek() == '{') {
                    input.poll();
                }
                buffer.pop();
            } else if (input.peek() == ']' && !buffer.isEmpty()) {
                if (buffer.peek() == '[') {
                    input.poll();
                }
                buffer.pop();
            } else if (input.peek() == ')' && !buffer.isEmpty()) {
                if (buffer.peek() == '(') {
                    input.poll();
                }
                buffer.pop();
            } else {
                buffer.push(input.poll());
            }

        }
        if (buffer.isEmpty() && input.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
