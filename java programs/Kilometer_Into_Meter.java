import java.util.Scanner;

public class Kilometer_Into_Meter {
    public static void main(String args[])
    {
      Double Distance_in_kilometer;
      Double Conversion_of_Distance;

      Scanner s= new Scanner(System.in);
      System.out.println("Enter Distance in Kilometer");
      Distance_in_kilometer=s.nextDouble();

Conversion_of_Distance=Distance_in_kilometer* 1000;

System.out.println ("Conversion of distance in meter" +Distance_in_kilometer+ " is" +Conversion_of_Distance+ ".");



    }
    }

