import java.util.*;
import java.lang.*;

public class MaximumofTwo
{
    public static void main (String[] args)
    {
        int a,b;
        Scanner S=new Scanner(System.in);
        
        System.out.print("\n Enter a first number :");
        a=S.nextInt();

        System.out.print("\n Enter a second number :");
        b=S.nextInt();

        if(a>b)
        {
            System.out.println("\n First number is maximum");
        }
        else if(a<b)
        {
            System.out.println("\n Second number is maximum");
        }
        else
        {
            System.out.println("\n Both number are same.");
        }
        
    }
}