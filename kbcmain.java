import java.util.*;
class kbcmain
{
	public static void main(String args[])
	{
		int choice;
		kbcmain aa = new kbcmain();
		aa.cls();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi,");
		System.out.println("   I'm Amitabh Bachan.");
		System.out.println("You are Welcome to Kaun Banega Karorpati game!!!");
		System.out.println("In this game you have to attempt 10 questions with following stage -:");
		System.out.println("The Stages Indicates Amount for A Question");
		System.out.println("");
		System.out.println("");
		System.out.println("Stage 1  -> Q1  -> 1,000RS ");
		System.out.println("Stage 2  -> Q2  -> 10,000RS ");
		System.out.println("Stage 3  -> Q3  -> 1,00,000RS ");
		System.out.println("Stage 4  -> Q4  -> 10,00,000RS ");
		System.out.println("Stage 5  -> Q5  -> 1,00,00,000RS ");
		System.out.println("Stage 6  -> Q6  -> 2,00,00,000RS ");
		System.out.println("Stage 7  -> Q7  -> 4,00,00,000RS ");
		System.out.println("Stage 8  -> Q8  -> 7,00,00,000RS ");
		System.out.println("Stage 9  -> Q9  -> 10,00,00,000RS ");
		System.out.println("Stage 10 -> Q10 -> 14,00,00,000RS ");
		System.out.println("");
		System.out.println("");
		System.out.println("In this Game You Have Two Life Lines -:");
		System.out.println("");
		System.out.println("1. 50-50 -: It will remove two Options from the given Four Options");
		System.out.println("2. Experts Advise(E-A) -: In this, Some Expert will give there Opinion for the Given Question");
		System.out.println("");
		System.out.println("In this, You can Use only one Life for One Question");
		System.out.println("If you want to start the game, then enter number 10 on your keyboard ");
		choice = sc.nextInt();
		if(choice==10)
		{						
			
			aa.cls();
			aa.putquestion();
		}
		else
		{
			System.out.println("Enter number 10 on your keyboard!!");
			choice = sc.nextInt();
			if(choice==10)
		{
			aa.cls();
			
			aa.putquestion();
		}
			
		}
		
	}
}