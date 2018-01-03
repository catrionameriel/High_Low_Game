public class Player {

    private String name;
    protected Hand hand;

    public Player (String playerName){
        this.name = playerName;
        this.hand = new Hand();
    }

    public String getName(){
        return name;
    }
}
