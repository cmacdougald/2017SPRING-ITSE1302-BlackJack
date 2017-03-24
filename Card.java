import java.util.Random;

public class Card {

    private Random objRandom = new Random();
    private int intCardValue = 0;

    public Card()
    {
        this.intCardValue = objRandom.nextInt(52) + 1;
    }

    public Card(int pintCard)
    {
        if ((pintCard < 1) || (pintCard > 52)) {
            pintCard = 1;
            System.err.println("Card::Card - Invalid card value setting to 1.");
        }
        this.intCardValue = pintCard;
    }

    public int getFace() {
        return ((intCardValue - 1) % 13) + 1;
    }

    public int getFaceValue() {
        int intFaceValue = getFace();
        
        //Face value of card
        if(intFaceValue > 10) {
            intFaceValue = 10;
        }

        return intFaceValue;
    }

    public String getFaceString() {
        String strReturn = "";
        int intFace = this.getFace();
        if(intFace == 1) {
            strReturn += "Ace";
        } else if (intFace == 11) {
            strReturn += "Jack";
        } else if (intFace == 12) {
            strReturn += "Queen";
        } else if (intFace == 13) {
            strReturn += "King";
        } else {
            strReturn += intFace;
        }
        return strReturn;
    }

    public int getSuite() {
        return (intCardValue - 1) / 13;
    }

    public String getSuiteString() {
        String strReturn = "";
        int intSuite = this.getSuite();
        if(intSuite == 0) {
            strReturn += "Club";
        } else if (intSuite == 1) {
            strReturn += "Diamonds";
        } else if (intSuite == 2) {
            strReturn += "Hearts";
        } else if (intSuite == 3) {
            strReturn += "Spades";
        }
        return strReturn;
    }

    public String toString() {
        String strReturn = "";
        strReturn += this.getFaceString();
        strReturn += " of ";
        strReturn += this.getSuiteString();
        return strReturn;
    }


    public static void main(String [] strArgs) {
        //Variables
        Card objCard = new Card();
        System.out.println(objCard);
    }

}