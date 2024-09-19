import java.util.Scanner;

public class Lowercase{
    public static void main (String []args)
    {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = input.next().charAt(0);


    
    ch = Character.toUpperCase(ch);
    String str1 = "Uppercase equivalent of character is " + ch;

    ch = Character.toLowerCase(ch);
    String str2 = "Lowercase equivalent of character is " + ch;

    // print cp3, cp4 values
    System.out.println( str1 );
    System.out.println( str2 );
 }
}