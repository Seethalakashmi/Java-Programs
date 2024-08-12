//library charges a fine for return the book late: 1-5-->0.50/day;6-10-->1/day;11-30-->5/day;after 30-membership cancelled.
import java.util.Scanner;
class LibraryFine23
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of days you returned the book late:");
		int return_day=sc.nextInt();
		double fine_amount=0;
		if(return_day>0 && return_day<=30)
		{
		if(return_day>=1 && return_day<=5)
		fine_amount=return_day*0.50;
		else if(return_day>=6 && return_day<=10)
		fine_amount=return_day*1;
		else if(return_day>10 && return_day<=30)
		fine_amount=return_day*5;
		System.out.println("Your fine amount is:"+fine_amount);
		}
		else
		{
			System.out.println("Membership Cancelled.");
	    }
	}
}
/*
Enter the number of days you returned the book late:
60
Membership Cancelled.

Enter the number of days you returned the book late:
30
Your fine amount is:150.0

Enter the number of days you returned the book late:
1
Your fine amount is:0.5
*/