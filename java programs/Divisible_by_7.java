import java.util.Scanner;

public class Divisible_by_7 {
    public static void main(String[] args) {
        int number;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:- ");
        number= s.nextInt();

        if (number%7==0) {
            System.out.println("The Number Is Divisible By 7");
        } else {
            System.out.println("Number Is Not Divisible By 7");
        }
    }
}
