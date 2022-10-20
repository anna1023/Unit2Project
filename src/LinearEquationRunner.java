import javax.sound.sampled.Line;
import java.util.Scanner;
public class LinearEquationRunner {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println ("Enter coordinate 1:");
        String coord1 = scan.nextLine();
        String x11 = coord1.substring(1,coord1.indexOf(","));
        int x1 = Integer.parseInt(x11);
        String y11 = coord1.substring(coord1.indexOf(",")+1,coord1.indexOf(")"));
        int y1 = Integer.parseInt(y11);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        String x22 = coord2.substring(1,coord2.indexOf(","));
        int x2 = Integer.parseInt(x22);
        String y22 = coord2.substring(coord2.indexOf(",")+1,coord2.indexOf(")"));
        int y2 = Integer.parseInt(y22);
        System.out.println(x2);
        System.out.println(y2);

        LinearEquation Linear = new LinearEquation(x1,x2,y1,y2);
        System.out.println(Linear.lineInfo());

        System.out.println("\nEnter a value for x: ");
        int newx = scan.nextInt();
    }
}
