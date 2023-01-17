package card;


public class Figure extends Card {


    private final String letter;

    public Figure(String letter) {

        super(10);
        this.letter = letter;

    }

    public String getName() {
        return this.letter;
    }


}