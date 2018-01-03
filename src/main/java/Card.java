public class Card {

    private SuitType suit;
    private ValueType value;

    public Card(SuitType suit, ValueType value){
        this.suit = suit;
        this.value = value;
    }

    public SuitType getSuitType() {
        return suit;
    }

    public ValueType getValueType() {
        return value;
    }

    public String getSuitName() {
        return suit.getSuitName();
    }

    public int getValueFromEnum() {
        return value.getValue();
    }
}
