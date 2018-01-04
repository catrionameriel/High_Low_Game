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

    public int findTotalOfHand(Player player){
        player.hand.addToTotal();
        return player.hand.getHandTotal();
    }

    public void compareHands(){
        int number = 1;
        ArrayList<Player> winner = new ArrayList<>();
        do {
            if (this.findTotalOfHand(players.get(number)) == this.findTotalOfHand(players.get(number += 1))) {
                number++;
            }
            else (this.findTotalOfHand(players.get(number)) > this.findTotalOfHand(players.get(number += 1))) ?
                winner.add(players.get(number)) :  winner.add(players.get(number += 1));
                number++;}
        while (number != numberOfPlayers);
    }
}
