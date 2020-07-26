package task_cleancode.task_cleancode;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class Main {
	static double principalAmount,time,rateOfInterest,simpleInterest,compoundInterest,numberOfCompoundings_PerAnnum;static Scanner input;
	public static void calculateSimpleInterest()
	{
		input=new Scanner(System.in);
		System.out.print("Enter Principal Amount:\n");
		principalAmount=input.nextDouble();
		System.out.print("Enter the Number of Years:\n");
		time=input.nextDouble();
		System.out.print("Enter Rate Of Interest:\n");
		rateOfInterest=input.nextDouble();
		SimpleInterest simpleObj=new SimpleInterest();
		simpleInterest=simpleObj.calculate_Simple_Interest(principalAmount,time,rateOfInterest);
		System.out.println("SimpleInterest is:- "+simpleInterest);
		System.out.println("Total Amount Including Simple Interest is :"+(simpleInterest+principalAmount));
	}
	public static void  calCompoundInterest()
	{
		input=new Scanner(System.in);
		System.out.print("Enter the Principal Amount:\n");
		principalAmount=input.nextDouble();System.out.print("Enter the Number of Years\n");time=input.nextDouble();
		System.out.print("Enter the Rate Of Interest:\n");rateOfInterest=input.nextDouble();
		System.out.print("Enter Compound Interval in Years Format:\n");numberOfCompoundings_PerAnnum=input.nextDouble();
		CompoundInterest compoundObj=new CompoundInterest();
		compoundInterest=compoundObj.calculate_Compound_Interest(principalAmount,time,rateOfInterest,numberOfCompoundings_PerAnnum);
		System.out.println("Compound Interest is:"+compoundInterest);
		System.out.println("Total Amount Including Compound Interest is :"+(compoundInterest+principalAmount));
	}
	
	
public static void main(String args[]) {
		input=new Scanner(System.in);
		System.out.print("Enter your choice 1.To calculate Simple Interest 2.To calculate Compound Interest:-\n");
		int choice=input.nextInt();
		switch(choice)
		{
			case 1:
				calculateSimpleInterest();
				break;
			case 2:
				calCompoundInterest();
				break;
			default:
				System.out.print("wrong choice");			
		}
	}
}