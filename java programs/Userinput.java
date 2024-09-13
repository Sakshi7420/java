
import java.util.Scanner;
public class Userinput {
public static void main(String args[]) {
System.out.println("Taking input from the user");

    Scanner sc = new Scanner(System.in);
System.out.println("Enter Student Name:-");
String name=sc.next();

Scanner sc1 = new Scanner(System.in);
System.out.println("Enter Roll Number:-");
String Roll_No=sc1.next();

Scanner sc2 = new Scanner(System.in);
System.out.println("Enter Course Name :-");
String Course=sc2.next();

Scanner sc3 = new Scanner(System.in);
System.out.println("Enter City Name:-");
String City=sc3.next();


System.out.println("-----------------");
System.out.println("Student Name:" +name);
System.out.println("Roll Number:" +Roll_No);
System.out.println("Course:" +Course);
System.out.println("City:" +City);

}
}


    


