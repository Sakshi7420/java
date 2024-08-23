import java.util.*;
import java.lang.*;

public class Switch
{
    public static void main(String[] args)
    {
        int day = 0;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter day number");
        day = S.nextInt();

        switch(day)
        {
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

        }
    }
}
