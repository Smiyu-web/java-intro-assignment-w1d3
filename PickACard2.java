import java.lang.Math;

public class PickACard2 {
    public static void main(String[] args) {

        int pickedCard = (int)(Math.random() * 13) + 1;
        int cardSuit = (int)(Math.random() * 4);


        String rank = "";
        String suit = "";

        switch(pickedCard) {
            case 1 : rank = "Ace";
            break;
            case 11 : rank = "Jack";
            break;
            case 12 : rank = "Queen";
            break;
            case 13 : rank = "King";
            break;
            default : rank = String.valueOf(pickedCard);
        }

        switch(cardSuit) {
            case 0 : suit = "Club";
            break;
            case 1 : suit = "Diamond";
            break;
            case 2 : suit = "Heart";
            break;
            case 3 : suit = "Spade";
        }

        System.out.println("The card you picked is " + rank + " of " + suit + ".");
        
    }

}
