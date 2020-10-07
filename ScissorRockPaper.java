import java.util.Scanner;
import java.lang.Math;

public class ScissorRockPaper {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 0-2:");
        int person = input.nextInt();

        int computer = (int)(Math.random() * 3);


        if (computer == 0) {
            switch (person) {
                case 0 : System.out.println("The computer is scissor. You are scissor. It is a draw.");
                break;
                case 1 : System.out.println("The computer is scissor. You are rock. You won.");
                break;
                case 2 : System.out.println("The computer is scissor. You are paper. You lose.");
                break;
            }
        } else if (computer == 1) {
            switch (person) {
                case 0 : System.out.println("The computer is rock. You are scissor. You lost.");
                break;
                case 1 : System.out.println("The computer is rock. You are rock. It is a draw");
                break;
                case 2 : System.out.println("The computer is rock. You are paper. You won.");
            }
        } else {
            switch (person) {
                case 0 : System.out.println("The computer is paper. You are scissor. You won.");
                break;
                case 1 : System.out.println("The computer is paper. You are rock. You lost");
                break;
                case 2 : System.out.println("The computer is paper. You are paper. It is a draw.");
            }
        }
    }
}
