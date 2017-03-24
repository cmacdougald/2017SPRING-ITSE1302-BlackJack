import java.util.ArrayList;

public class BlackJack {

    public static void main(String [] strArgs) {
        BlackJack objGame = new BlackJack();
        objGame.playRound();
    }

    public void playRound() {
        Deck objDeck = new Deck();
        objDeck.shuffle();

        ArrayList<Player> aryPlayers = new ArrayList<Player>();
        aryPlayers.add(new Player());
        aryPlayers.add(new Player());
        aryPlayers.add(new Player("Dealer"));

        int intCurrentPlayer = 0;

        int intCounter = 0;
        while(intCounter < 2) {
            intCurrentPlayer = 0;
            while(intCurrentPlayer < aryPlayers.size()) {
                aryPlayers.get(intCurrentPlayer).addCard(objDeck.getCard());
                intCurrentPlayer++;
            }
            intCounter++;
        }

        while(aryPlayers.get(aryPlayers.size()-1).getTotalFaceValue() <= 16) {

            aryPlayers.get(aryPlayers.size()-1).addCard(objDeck.getCard());        
        }


        intCurrentPlayer = 0;
        while(intCurrentPlayer < aryPlayers.size()) {
            System.out.print(aryPlayers.get(intCurrentPlayer).name() + " ");
            aryPlayers.get(intCurrentPlayer).printHand();
            intCurrentPlayer++;
        }

        if(objDeck.shouldShuffle()) {
            objDeck.shuffle();
        }

        /*
        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.printHand();
        */
    }
}