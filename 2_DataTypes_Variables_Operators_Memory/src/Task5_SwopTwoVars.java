
public class Task5_SwopTwoVars {

    public static void main(String[] args) {
        byte numberOne = 4;
        byte numberTwo = 7;
        byte buffer;

        System.out.println(numberOne + " is number One and number two is:  " + numberTwo);

        buffer = numberOne;
        numberOne = numberTwo;
        numberTwo = buffer;

        System.out.println(numberOne + " is number One and number two is:  " + numberTwo);

    }
}
