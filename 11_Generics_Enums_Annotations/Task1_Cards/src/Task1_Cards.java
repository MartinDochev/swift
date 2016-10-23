
public class Task1_Cards {

    public enum CardSuit {

        Clubs, Diamonds, Hearts, Spades;

        public static void printSuit() {
            for (CardSuit suit : values()) {
                System.out.print(suit + " ");
            }
            System.out.println();
        }
    }

    public enum CardRank {

        Two, Three, Four, Six, Seven, Eigth, Nine, Ten, Jack, Queen, King, Ace;

        public static void printCardRank() {
            for (CardRank rank : values()) {
                System.out.print(rank + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CardSuit.printSuit();
        CardRank.printCardRank();
    }
}
