package card;

public class PipCard extends Card{

    public PipCard(int value) {

        super(value);

    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }


}