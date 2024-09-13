import java.util.Scanner;

public class Conversion_into_Celsius
{
    public static void main(String args[])
    {
        Double fahrenheit, Celsius;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter fahrenheit temperature");
        fahrenheit = s.nextDouble();
        
        Celsius=((fahrenheit - 32) * 5/9);

        System.out.println("Temperature in Celsius" +fahrenheit+ "is" +Celsius+ ".");
    }
}
