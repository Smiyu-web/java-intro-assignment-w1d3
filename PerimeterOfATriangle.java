import java.util.Scanner;


public class PerimeterOfATriangle {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter widths of edge1.");
        int edge1 = input.nextInt();

        System.out.print("Please enter widths of edge2.");
        int edge2 = input.nextInt();

        System.out.print("Please enter widths of edge3.");
        int edge3 = input.nextInt();

        int total = edge1 + edge2 + edge3;

        if ((edge1 + edge2) > edge3 && (edge2 + edge3) > edge1 && (edge3 + edge1) > edge2) {
            System.out.println("A perimeter is " + total);
        } else {
            System.out.println("The input is invalid.");
        }

        
    }
}
