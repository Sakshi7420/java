import java.util.Scanner;
import java.util.function.DoubleConsumer;

public class Area_of_Circle {
    public static void main(String args[])
{
    Double Radius;
    Double PI=3.14 , Area;
    Scanner S = new Scanner(System.in);

    System.out.println("Enter Radius :-");
    Radius=S.nextDouble();

    Area = PI * Radius * Radius;
    System.out.println("Area_of_Circle of radius " +Radius+" and PI "+PI+" is "+Area+ ".");

}
}