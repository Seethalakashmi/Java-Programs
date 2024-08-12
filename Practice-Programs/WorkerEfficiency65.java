//based on working hours to calculate efficiency:2-3hrs-->high efficiency;3-4hrs-->ordered to improve speed;4-5hrs-->training to improve high speed;>5hrs-->leave the company.
import java.util.Scanner;
class WorkerEfficiency24
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the hours for employee to complete the work:");
	    int hours=sc.nextInt();
		String efficiency="";
		if(hours>0)
		{
		if(hours>0 && hours<=3)
		efficiency="You are high efficiency worker.";
		else if(hours>=3 && hours<=4)
		efficiency="You should improve your speed.";
		else if(hours>=4 && hours<=5)
		efficiency="You should train to improve your speed high.";
		System.out.println("Your remark:"+efficiency);
		}
		else
			System.out.println("You should leave the company.");
    }
}
/*
Enter the hours for employee to complete the work:
1
Your remark:You are high efficiency worker.
*/
