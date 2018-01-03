import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;


    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, ValueType.ACE);

    }

    @Test
    public void canGetSuitType(){
        assertEquals(SuitType.HEARTS, card.getSuitType());
    }

    @Test
    public void canGetValueType(){
        assertEquals(ValueType.ACE, card.getValueType());
    }

    @Test
    public void canGetSuit(){
        assertEquals("Hearts", card.getSuitName());
    }

    @Test
    public void canGetValue(){
        assertEquals(14, card.getValueFromEnum());
    }

}
