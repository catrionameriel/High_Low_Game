import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    private int totalValue;
    private int handSize;

    public Hand(){
        this.cards = new ArrayList<>();
        this.handSize = 0;
        this.totalValue = 0;

    }

    public int countCardsInHand(){
        return cards.size();
    }

    public int getHandSize() {
        return handSize;
    }

    public void fillHand(Deck deck){
        while ((this.cards.size()) < this.handSize) {
        cards.add(deck.removeCard());
        }
    }

    public int getHandTotal(){
        return this.totalValue;
    }

    public void addToTotal() {
        for(Card card : cards) {
            totalValue += (card.getValueFromEnum());
        }
    }

    public void setHandSize(int handSize) {
        this.handSize = handSize;
    }
}
