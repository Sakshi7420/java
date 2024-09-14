import java.util.Scanner;

public class Positive_Negative {
    public static void main (String []args)
{

int Number;

Scanner s = new Scanner(System.in);
System.out.println("Enter a Number");
Number = s.nextInt();

if (Number>0) {
    System.out.println("Number is Positive");
} else {
    System.out.println("Number is Negative");
}




}
}
