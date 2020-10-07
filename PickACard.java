import java.lang.Math;

public class PickACard {
    
    public static void main(String[] args) {
        
        int pickedCard= (int)(Math.random() * 13);
        int cardSuit = (int)(Math.random() * 4);


        if (cardSuit == 0) {
            switch(pickedCard) {
                case 0 : System.out.println("The card you picked is Ace of Clubs." );
                break;
                case 10 : System.out.println("The card you picked is Jack of Clubs." );
                break;
                case 11 : System.out.println("The card you picked is Queen of Clubs." );
                break;
                case 12 : System.out.println("The card you picked is King of Clubs." );
                break;
                default : System.out.println("The card you picked is " + pickedCard + " of Clubs.");
            }
        } else if (cardSuit == 1) {
            switch(pickedCard) {
                case 0 : System.out.println("The card you picked is Ace of Diamonds." );
                break;
                case 10 : System.out.println("The card you picked is Jack of Diamonds." );
                break;
                case 11 : System.out.println("The card you picked is Queen of Diamonds." );
                break;
                case 12 : System.out.println("The card you picked is King of Diamonds." );
                break;
                default : System.out.println("The card you picked is " + pickedCard + " of Diamonds.");
            }
        } else if (cardSuit == 2) {
            switch(pickedCard) {
                case 0 : System.out.println("The card you picked is Ace of Hearts." );
                break;
                case 10 : System.out.println("The card you picked is Jack of Hearts." );
                break;
                case 11 : System.out.println("The card you picked is Queen of Hearts." );
                break;
                case 12 : System.out.println("The card you picked is King of Hearts." );
                break;
                default : System.out.println("The card you picked is " + pickedCard + " of Hearts.");
            } 
        } else {
            switch(pickedCard) {
                case 0 : System.out.println("The card you picked is Ace of Spades." );
                break;
                case 10 : System.out.println("The card you picked is Jack of Spades." );
                break;
                case 11 : System.out.println("The card you picked is Queen of Spades." );
                break;
                case 12 : System.out.println("The card you picked is King of Spades." );
                break;
                default : System.out.println("The card you picked is " + pickedCard + " of Spades.");
            } 
        }


    }
}

