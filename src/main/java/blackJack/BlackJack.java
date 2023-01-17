
package blackJack;

import card.*;
import player.Player;
import java.util.ArrayList;
import java.util.*;

public class BlackJack {

    private static final int BlackJack = 21;
    private static final int MinCroupier = 17;

    public static ArrayList<Player> getWinners(Player p1, Player p2, Player p3, Player croupier, List<Card> deck) {

        ArrayList<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);

        ArrayList<Player> winners = new ArrayList<>();

        fillCroupierHand(croupier, deck);

        List<Card> croupierHand = croupier.getHand();

        if(isBlackJack(croupierHand)) {

            winners.add(croupier);
            return winners;
        }

        boolean blackjackPlayer = false;
        for(Player player:players) {

            List<Card> playerHand = player.getHand();

            if (isBlackJack(playerHand)) {
                winners.add(player);
                blackjackPlayer = true;
                continue;
            }

            if (isWinner(playerHand) && !blackjackPlayer){
                winners.add(player);
            }
        }

        if (winners.size() == 0 && isWinner(croupierHand)) {
            winners.add(croupier);
        }

        return winners;
    }



    public static boolean isWinner(List<Card> hand) {
        return (getSumHand(hand) == BlackJack);

    }

    public static boolean isBlackJack(List<Card> hand) {
        return (getSumHand(hand) == BlackJack) && (hand.size() == 2);
    }

    public static int getSumHand(List<Card> hand) {

        int sum = 0, A = 0;

        for (Card card : hand) {
            sum += card.getValue();
            if(card instanceof Ace){
                A++;
            }
        }

        if(A > 0 && sum > 21){
            while( sum > 21) {
                sum -= 10;
            }
        }
        return sum;
    }

    public static void fillCroupierHand(Player croupier, List<Card> deck) {

        List<Card> hand = croupier.getHand();

        int sum = getSumHand(hand);
        int i = 0;

        while (sum < MinCroupier && i < deck.size()) {

            Card card = deck.get(i);
            deck.remove(card);

            croupier.addCard(card);

            hand = croupier.getHand();

            sum = getSumHand(hand);
            i++;
        }
    }
}