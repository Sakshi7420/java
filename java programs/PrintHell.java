import java.util.Scanner;

public class PrintHell {
    public static void main (String args[])
{
   int Number;

   Scanner s = new Scanner(System.in);
   System.out.println("Enter a Number");
   Number=s.nextInt();
   
  if (Number<=10)
   {
    System.out.println("Hello");
  }
    else{
      System.out.println("World");
    }
  }
}