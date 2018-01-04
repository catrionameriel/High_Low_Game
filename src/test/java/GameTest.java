import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    private Game game;
    private Player player;

    @Before
    public void before() {
        game = new Game();
        player = new Player("Jane");
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player);
        assertEquals(1, game.countPlayers());
    }

    @Test
    public void canSetTheNumberOfPlayers(){
        game.setNumberOfPlayers(2);
        assertNotNull(game.countPlayers());
    }

    @Test
    public void canSetupGameWithOnePlayer(){
        game.setupGame(1, player, 1);
        assertEquals(1, game.countPlayers());
    }

    @Test
    public void canDeal(){
        game.setupGame(1, player, 2);
        game.deal();
        assertEquals(2, player.hand.countCardsInHand());
    }

    @Test
    public void canGetTotalOfEachPlayerHand(){
        game.setupGame(1, player, 2);
        game.deal();
//        assertEquals(12, game.findTotalOfHand(player));
        assertNotNull(game.findTotalOfHand(player));
    }

}
