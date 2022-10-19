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
        System.out.println("\nThe two points are: "+coord1+" and "+coord2);

        LinearEquation Linear = new LinearEquation(x1,x2,y1,y2);
        System.out.println("The equation of the line between these points is: y = "+Linear.equation());
        System.out.println("The slope of this line is: "+Linear.slope());
        System.out.println("The y-intercept of the line is: "+Linear.yinter());
        System.out.println("The distance between the two points is: "+Linear.distance());

        System.out.println("\nEnter a value for x: ");
        int newx = scan.nextInt();
    }
}
