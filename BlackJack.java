public class BlackJack {

    public static void main(String [] strArgs) {
        BlackJack objGame = new BlackJack();
        objGame.playRound();
    }

    public void playRound() {
        Deck objDeck = new Deck();
        Player objPlayer1 = new Player();
        Player objPlayer2 = new Player();
        Player objDealer = new Player();
        if(objDeck.shouldShuffle()) {
            objDeck.shuffle();
        }

        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.addCard(objDeck.getCard());
        objPlayer1.printHand();
    }
}