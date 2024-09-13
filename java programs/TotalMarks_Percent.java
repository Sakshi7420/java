 import java.util.Scanner;
public class TotalMarks_Percent {
	public static void main(String[] args){
		int Subject1=0, Subject2=0, Subject3=0, Total_Marks= 0;
		float percent;
        Scanner S= new Scanner (System.in);
        System.out.println("Enter Subject1 Marks :-");
    Subject1=S.nextInt();
    System.out.println("Enter Subject2 Marks :-");
    Subject2=S.nextInt();
    System.out.println("Enter Subject3 Marks :-");
    Subject3=S.nextInt();
		
		Total_Marks = Subject1 + Subject2 + Subject3 ;

        System.out.println("Total_Marks is "  +Total_Marks+ ".");

        
        percent = (Total_Marks / (float)3);

        System.out.println("Percentage is "  +percent+ "%");



		}

		
	}
    

