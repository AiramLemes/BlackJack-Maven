package card;



public class Ace extends Card {

    public Ace() {
        super(11);
    }
    public int getOtherValue(){

        return 1;
    }

    @Override
    public String toString() {
        return "A";
    }


}