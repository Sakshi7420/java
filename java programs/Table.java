import java.util.*;
import java.lang.*;

public class Table
{
    public static void main(String[] args)
    {
        int No = 0, i = 1;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter a number:");
        No = S.nextInt();

        while(i <= 10)
        {
            System.out.println(No+" * "+ i +" = " +No*i );
            i++;
        }
    }
}