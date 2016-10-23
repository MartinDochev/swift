@CardsAnnotation(type = "enum", category = "CardGames", description = "Contains a set of constants for the ranks of a card.")
public enum CardRank {

    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Jack(11),
    Queen(12),
    King(13),
    Ace(14);

    private final int value;

    private CardRank(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;

    }

}
