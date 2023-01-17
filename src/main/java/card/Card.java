package card;


public abstract class Card {


    private final int value;

    public Card(int value){

        this.value = value;
    }

    public int getValue() {
        return value;
    }



}