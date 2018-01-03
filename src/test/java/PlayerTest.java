import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;

    @Before
    public void before(){
        player1 = new Player("Catriona");
    }

    @Test
    public void playerHasName(){
        assertEquals("Catriona", player1.getName());
    }

}
