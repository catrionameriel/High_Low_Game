import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        this.fillDeck();
    }

    public int getDeckSize() {
        return cards.size();
    }

    private void fillDeck(){
        for(SuitType suit : SuitType.values()){
           for(ValueType value : ValueType.values()){
               cards.add(new Card(suit, value));
           }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card removeCard() {
        return cards.remove(0);
    }



}
