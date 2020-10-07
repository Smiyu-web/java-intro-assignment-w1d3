import java.util.Scanner;


public class FindDaysInAMonth {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number of year:");
        int yearNum = input.nextInt();

        System.out.println("Please enter a number of month:");
        int monthNum = input.nextInt();

        if (yearNum % 4 == 0 && monthNum == 2) {
            System.out.println("February " + yearNum + " had 29 days.");
            
        } else {
            switch(monthNum) {
                case 1 : System.out.println("January " + yearNum + " had 31 days.");
                break;
                case 2 : System.out.println("February " + yearNum + " had 30 days.");
                break;
                case 3 : System.out.println("March " + yearNum + " had 31 days.");
                break;
                case 4 : System.out.println("April " + yearNum + " had 30 days.");
                break;
                case 5 : System.out.println("May " + yearNum + " had 31 days.");
                break;
                case 6 : System.out.println("June " + yearNum + " had 30 days.");
                break;
                case 7 : System.out.println("July " + yearNum + " had 31 days.");
                break;
                case 8 : System.out.println("August " + yearNum + " had 30 days.");
                break;
                case 9 : System.out.println("September " + yearNum + " had 31 days.");
                break;
                case 10 : System.out.println("October " + yearNum + " had 30 days.");
                break;
                case 11 : System.out.println("November " + yearNum + " had 31 days.");
                break;
                case 12 : System.out.println("December " + yearNum + " had 30 days.");
                break;
                default : System.out.println("The number is invalid");
            }
 
        }


    }
}
