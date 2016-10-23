@CardsAnnotation(type = "enum", category = "CardGames", description = "Contains a set of constants for the suits of a card.")

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
