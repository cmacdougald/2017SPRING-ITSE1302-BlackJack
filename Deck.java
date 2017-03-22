import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> aryDeck = new ArrayList<Card>();
    private int intCounterDeck = 0;

    public Deck() {
        init();
    }

    public Deck(int intDecks) {
        int intCounter = 0;
        while(intCounter < intDecks) {
            init();
        }
    }

    private void init() {
        int intCounter = 1;
        while(intCounter <= 52) {
            aryDeck.add(new Card(intCounter));
            intCounter++;
        }
    }

    public int percentLeft() {
        return 0;
    }

    public boolean shouldShuffle() {
        return true;
    }

    public void shuffle() {
        System.out.println("Shuffling...");
        Collections.shuffle(aryDeck);
    }

    public Card getCard() {
        return aryDeck.get(intCounterDeck++);
    }
}