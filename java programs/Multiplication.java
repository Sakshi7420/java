import java.util.Scanner;

public class Multiplication {
     public static void main(String args[])
{
    int Number1=0, Number2=0, Multiplication=0;
    Scanner S = new Scanner(System.in);

    System.out.println("Enter First Number :-");
    Number1=S.nextInt();
    System.out.println("Enter Second Number :-");
    Number2=S.nextInt();

    Multiplication = Number1 * Number2;
    System.out.println("Multiplication is " +Number1+" and "+Number2+" is "+Multiplication+ ".");
}
}
