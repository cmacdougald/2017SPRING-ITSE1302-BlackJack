import java.util.Random;

public class Card {

    private Random objRandom = new Random();
    private int intCardValue = 0;

//   enum Suite {Clubs, Diamonds, Hearts, Spades}
//    enum Face {Joker, Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    public Card()
    {
        this.intCardValue = objRandom.nextInt(52) + 1;
    }

    public Card(int pintCard)
    {
        this.intCardValue = pintCard;
    }

    public int getFace() {
        return ((intCardValue - 1) % 13) + 1;
    }

    public int getSuite() {
        return (intCardValue - 1) / 13;
    }

    public int getFaceValue() {
        int intFaceValue = getFace();
        
        //Face value of card
        if(intFaceValue > 10) {
            intFaceValue = 10;
        }

        return intFaceValue;
    }

    public String toString() {
        String strReturn = "";
        int intFace = this.getFace();
        int intSuite = this.getSuite();

    //Text face value
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

        strReturn += " of ";

        //Suite as string
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


    public static void main(String [] strArgs) {
        //Variables
        Card objCard = new Card();
        System.out.println(objCard);
    }

}