
public class Card implements Comparable<Card>{
    
   
    
    CardSuit cardSuit;
    CardRank cardRank;
    
   
    public Card(CardRank rank, CardSuit suit) {
        this.cardSuit = suit;
        this.cardRank = rank;
        
    }

   
  
    @Override
    public String toString(){
        String str;
        str = this.cardRank.name() + " of " + this.cardSuit.name();
        return str;
    }

    @Override
    public int compareTo(Card t) {
       
       return 1;
    }
}
