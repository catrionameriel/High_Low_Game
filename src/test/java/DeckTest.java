import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

//    @Test
//    public void deckStartsEmpty(){
//        assertEquals(0, deck.getDeckSize());
//    }

    @Test
    public void deckCanBeFilled(){
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void canGetCard(){
        assertNotNull(deck.removeCard());
    }

}
