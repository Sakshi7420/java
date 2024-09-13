import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String args[])
    {
        Double Height, Width;
        Double Area_of_Rectangle;

        Scanner s= new Scanner (System.in);
        System.out.println("Enter Height of Rectangle");
        Height=s.nextDouble();

        Scanner S1= new Scanner (System.in);
        System.out.println("Enter Width of Rectangle");
        Width=S1.nextDouble();

        Area_of_Rectangle=Height*Width;

        System.out.println("Area_of_Rectangle " +Height+" and PI "+Width+" is "+Area_of_Rectangle+ ".");
    }
}
