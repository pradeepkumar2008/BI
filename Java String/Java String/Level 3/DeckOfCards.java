import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

    public static String[] initializeDeck() {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distribute(String[] deck, int n, int players) {
        if (n % players != 0) return null;
        String[][] res = new String[players][n / players];
        int k = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n / players; j++) {
                res[i][j] = deck[k++];
            }
        }
        return res;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) System.out.print(card + ", ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        String[][] res = distribute(deck, n, players);
        if (res == null) System.out.println("Cards cannot be evenly distributed.");
        else printPlayers(res);
    }
}
