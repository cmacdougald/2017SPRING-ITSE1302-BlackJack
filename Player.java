import java.util.ArrayList;

public class Player {

    private ArrayList<Card> aryHand = new ArrayList<Card>();

    public void name(int intPlayerNumber) {
    }

    public void name(String strName) {
    }

    public String name() {
        return "no one";
    }

    public void setMoney(int intMoney) {
    }

    public int getMoney() {
        return 0;
    }

    public void setBet(int intBet) {

    }

    public int getBet() {
        return 0;
    }

    public int getTotalFaceValue() {
        return 0;
    }

    public void addCard(Card objCard) {
        aryHand.add(objCard);
    }

    public void clearHand() {
        aryHand.clear();
    }

    public void printHand() {
        int intIndex = 0;
        while(intIndex < aryHand.size()) {
            System.out.print(aryHand.get(intIndex));
            System.out.print(" | ");
            intIndex++;
        }
        System.out.println();
    }

    public void printMoney() {
    }
}