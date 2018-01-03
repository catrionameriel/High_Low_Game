import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private int numberOfPlayers;

    public Game(){
        this.deck = new Deck();
        this.players = new ArrayList<>();
        this.numberOfPlayers = 0;
    }

    public void setNumberOfPlayers(int newNumber){
        numberOfPlayers = newNumber;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public int countPlayers(){
        return players.size();
    }

    public void setupGame(int numberOfPlayers, Player player, int handSize){
        deck.shuffle();
        this.setNumberOfPlayers(numberOfPlayers);
        while(this.countPlayers() != numberOfPlayers){
            this.addPlayer(player);
        }
        player.hand.setHandSize(handSize);
    }

    public void deal(){
        for(Player player : players){
            player.hand.fillHand(deck);
        }
    }

    public void findTotalOfHand(){
        
    }

}
