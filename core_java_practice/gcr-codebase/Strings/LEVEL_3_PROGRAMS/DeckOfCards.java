import java.util.Scanner;

public class DeckOfCards {

    static String[] createDeck() {

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};

        String[] ranks = {
                "2","3","4","5","6","7","8","9","10",
                "Jack","Queen","King","Ace"
        };

        String[] deck = new String[52];

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    static void shuffle(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCard =
                    i + (int)(Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = createDeck();

        shuffle(deck);

        int index = 0;

        for (int i = 1; i <= players; i++) {

            System.out.println("Player " + i);

            for (int j = 0; j < cards; j++) {
                System.out.println(deck[index++]);
            }

            System.out.println();
        }
    }
}