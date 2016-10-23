
public enum CardSuit {

    Clubs(1),
    Diamonds(2),
    Hearts(3),
    Spades(4);

    private final int value;
      
    private CardSuit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
