public enum SuitType {

    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades"),
    CLUBS("Clubs");


    private String suitName;

    SuitType(String suitName){
        this.suitName = suitName;
    }

    public String getSuitName(){
        return this.suitName;
    }

}
