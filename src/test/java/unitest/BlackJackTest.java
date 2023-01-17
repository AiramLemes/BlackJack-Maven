package unitest;

import blackJack.BlackJack;
import card.*;
import player.Player;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class BlackJackTest {

    @Test

    public void case1() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new Figure("J"));
        p1.addCard(new Ace());

        p2.addCard(new PipCard(10));
        p2.addCard(new PipCard(5));
        p2.addCard(new PipCard(6));

        p3.addCard(new Ace());
        p3.addCard(new Ace());
        p3.addCard(new PipCard(9));


        player.Player croupier = new Player("Croupier");
        croupier.addCard(new PipCard(9));
        croupier.addCard(new PipCard(7));


        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(6));
        deck.add(new PipCard(4));
        deck.add(new Figure("K"));
        deck.add(new PipCard(2));


        ArrayList<Player> winners = new ArrayList<>();
        winners.add(p1);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }


    @Test
    public void case2() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new Figure("J"));
        p1.addCard(new PipCard(6));

        p2.addCard(new PipCard(10));
        p2.addCard(new PipCard(5));
        p2.addCard(new PipCard(6));

        p3.addCard(new PipCard(6));
        p3.addCard(new PipCard(7));
        p3.addCard(new PipCard(5));


        player.Player croupier = new Player("Croupier");
        croupier.addCard(new PipCard(4));
        croupier.addCard(new PipCard(5));
        croupier.addCard(new PipCard(9));


        List<Card> deck = new ArrayList<>();
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new Figure("K"));
        deck.add(new PipCard(2));


        ArrayList<Player> winners = new ArrayList<>();
        winners.add(p2);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }


    @Test
    public void case3() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new Figure("J"));
        p1.addCard(new Ace());

        p2.addCard(new PipCard(5));
        p2.addCard(new PipCard(8));
        p2.addCard(new PipCard(9));

        p3.addCard(new PipCard(2));
        p3.addCard(new PipCard(9));
        p3.addCard(new Figure("Q"));


        player.Player croupier = new Player("Croupier");
        croupier.addCard(new PipCard(5));
        croupier.addCard(new PipCard(6));
        croupier.addCard(new PipCard(5));
        croupier.addCard(new PipCard(5));


        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(6));
        deck.add(new Figure("Q"));
        deck.add(new PipCard(2));
        deck.add(new PipCard(8));


        ArrayList<Player> winners = new ArrayList<>();
        winners.add(p1);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }


    @Test
    public void case4() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new Figure("J"));
        p1.addCard(new Figure("k"));
        p1.addCard(new Ace());

        p2.addCard(new PipCard(10));
        p2.addCard(new PipCard(5));
        p2.addCard(new PipCard(6));

        p3.addCard(new Ace());
        p3.addCard(new Ace());
        p3.addCard(new PipCard(9));


        player.Player croupier = new Player("Croupier");
        croupier.addCard(new PipCard(9));
        croupier.addCard(new PipCard(7));


        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(6));
        deck.add(new PipCard(4));
        deck.add(new Figure("K"));
        deck.add(new PipCard(2));


        ArrayList<Player> winners = new ArrayList<>();
        winners.add(p1);
        winners.add(p2);
        winners.add(p3);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }


    @Test
    public void case5() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new Figure("J"));
        p1.addCard(new Figure("Q"));
        p1.addCard(new PipCard(5));

        p2.addCard(new Ace());
        p2.addCard(new Figure("Q"));

        p3.addCard(new Figure("K"));
        p3.addCard(new Ace());



        player.Player croupier = new Player("Croupier");
        croupier.addCard(new Figure("K"));
        croupier.addCard(new Ace());

        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(6));
        deck.add(new PipCard(4));
        deck.add(new Figure("K"));
        deck.add(new PipCard(2));


        ArrayList<Player> winners = new ArrayList<>();
        winners.add(croupier);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }




    @Test
    public void case6() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new Figure("J"));
        p1.addCard(new PipCard(4));
        p1.addCard(new PipCard(47));

        p2.addCard(new PipCard(6));
        p2.addCard(new PipCard(5));
        p2.addCard(new Figure("Q"));

        p3.addCard(new PipCard(2));
        p3.addCard(new PipCard(8));
        p3.addCard(new PipCard(9));



        Player croupier = new Player("Croupier");
        croupier.addCard(new Figure("J"));

        List<Card> deck = new ArrayList<>();
        deck.add(new Ace());
        deck.add(new PipCard(6));
        deck.add(new PipCard(8));
        deck.add(new PipCard(2));


        ArrayList<Player> winners = new ArrayList<>();
        winners.add(croupier);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }



    @Test
    public void case7() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new PipCard(5));
        p1.addCard(new PipCard(10));
        p1.addCard(new PipCard(8));

        p2.addCard(new PipCard(3));
        p2.addCard(new Ace());
        p2.addCard(new PipCard(9));
        p2.addCard(new Figure("Q"));

        p3.addCard(new Figure("Q"));
        p3.addCard(new Figure("J"));



        Player croupier = new Player("Croupier");
        croupier.addCard(new PipCard(9));
        croupier.addCard(new PipCard(1));

        List<Card> deck = new ArrayList<>();
        deck.add(new Ace());
        deck.add(new PipCard(2));
        deck.add(new PipCard(3));

        ArrayList<Player> winners = new ArrayList<>();
        winners.add(croupier);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }



    @Test
    public void case8() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new Figure("K"));
        p1.addCard(new Ace());

        p2.addCard(new PipCard(3));
        p2.addCard(new PipCard(9));
        p2.addCard(new Figure("Q"));

        p3.addCard(new Figure("Q"));
        p3.addCard(new Ace());



        Player croupier = new Player("Croupier");
        croupier.addCard(new PipCard(9));
        croupier.addCard(new PipCard(1));

        List<Card> deck = new ArrayList<>();
        deck.add(new Ace());
        deck.add(new PipCard(2));
        deck.add(new PipCard(3));

        ArrayList<Player> winners = new ArrayList<>();
        winners.add(p1);
        winners.add(p3);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }


    @Test
    public void case9() {

        Player p1, p2, p3;

        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        p3 = new Player("Player 3");

        p1.addCard(new PipCard(5));
        p1.addCard(new Ace());
        p1.addCard(new Ace());
        p1.addCard(new PipCard(4));

        p2.addCard(new PipCard(3));
        p2.addCard(new PipCard(9));
        p2.addCard(new Figure("Q"));

        p3.addCard(new Figure("Q"));
        p3.addCard(new Figure("K"));



        Player croupier = new Player("Croupier");
        croupier.addCard(new PipCard(9));
        croupier.addCard(new PipCard(5));

        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(2));
        deck.add(new PipCard(3));

        ArrayList<Player> winners = new ArrayList<>();
        winners.add(p1);
        assertEquals(winners, BlackJack.getWinners(p1, p2,
                p3, croupier, deck));
    }


}