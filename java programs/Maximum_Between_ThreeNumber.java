import java.util.Scanner;

public class Maximum_Between_ThreeNumber {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int Num1 = s.nextInt();     
        int Num2 = s.nextInt();
        int Num3 = s.nextInt();
        if ( Num1 >=Num2 && Num1>=Num3) {
            System.out.println( "Number1 is greatest  " +Num1);

        } else if(Num2>=Num1 && Num2>=Num3) {
            System.out.println("Number2 is greatest  "  +Num2);
        }else {
            System.out.println("Number3 is greatest  "  +Num3);
    }
}
}