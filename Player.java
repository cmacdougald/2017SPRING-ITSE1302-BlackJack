import java.util.ArrayList;

public class Player {

    static int intTotalNumberOfPlayers = 0;
    private ArrayList<Card> aryHand = new ArrayList<Card>();
    int intCurrentBet = 0;
    int intMoney = 2000;
    String strName = "no one";

    public Player() {
        name(++intTotalNumberOfPlayers);
    }

    public Player(String pstrName) {
        name(pstrName);
    }

    public void name(int intPlayerNumber) {
        name("Player " + intPlayerNumber);
    }

    public void name(String pstrName) {
        strName = pstrName;
    }

    public String name() {
        return strName;
    }

    public void setMoney(int intMoney) {
    }

    public int getMoney() {
        return 0;
    }

    public void setBet(int intBet) {

    }

    public void inputBet() {
        //TODO: Input using scanner the bet value
    }

    public int getBet() {
        return 0;
    }

    public int getTotalFaceValue() {
        int intFaceValueTotal = 0;
        int intCurrentCard = 0;
        Card objCard = null;
        boolean hasAce = false;
        while(intCurrentCard < aryHand.size()){
            objCard = aryHand.get(intCurrentCard);
            intFaceValueTotal += objCard.getFaceValue();
            if(objCard.getFace() == 1) {
                hasAce = true;
            }
            intCurrentCard++;
        }

        if(hasAce && intFaceValueTotal <= 11) {
            intFaceValueTotal += 10;
        }

        return intFaceValueTotal;
    }

    public void addCard(Card objCard) {
        aryHand.add(objCard);
    }

    public void clearHand() {
        aryHand.clear();
    }

    public void printHand() {
        System.out.println(aryHand + " Total: " + getTotalFaceValue());
    }

    public void printMoney() {
        System.out.println("Total: $" + intMoney + "\tBet: $" + intCurrentBet);
    }
}