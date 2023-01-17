package player;


import card.Card;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private final ArrayList<Card> hand = new ArrayList<>();


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return new ArrayList<>(hand);
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public void addCards(List<Card> cards){
        for(Card card : cards){
            addCard(card);
        }
    }


    @Override
    public String toString(){
        String s = "";
        s = hand.stream().map((c) -> c.toString() + ", ").reduce(s, String::concat);
        return name + ": [" + s.substring(0, s.length()-2) + "]";
    }
}