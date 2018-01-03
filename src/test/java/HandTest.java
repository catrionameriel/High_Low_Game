import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HandTest {

    private Hand hand;
    private Deck deck;

    @Before
    public void before(){
        hand = new Hand();
        deck = new Deck();
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, hand.countCardsInHand());
    }

    @Test
    public void handStartsWithNoTotal(){
        assertEquals(0, hand.getHandTotal());
    }

    @Test
    public void handSizeStartsEmpty(){
        assertEquals(0, hand.getHandSize());
    }

    @Test
    public void canSetHandSize(){
        hand.setHandSize(1);
        assertEquals(1, hand.getHandSize());
    }

    @Test
    public void canFillHand(){
        hand.setHandSize(1);
        hand.fillHand(deck);
        assertEquals(1, hand.countCardsInHand());
    }

    @Test
    public void canAddMoreThanOneCard(){
        hand.setHandSize(2);
        hand.fillHand(deck);
        assertEquals(2, hand.countCardsInHand());
    }

    @Test
    public void canGetNewTotalOfHand(){
        hand.setHandSize(2);
        hand.fillHand(deck);
        hand.addToTotal();
        assertEquals(2, hand.countCardsInHand());
        assertNotNull(hand.getHandTotal());
    }

}
