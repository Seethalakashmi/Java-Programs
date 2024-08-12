import java.util.Scanner;
class LeapYear6 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println("The year "+ year+" is leap year.");
		}
		else 
		{
			System.out.println("The year "+ year+" is not a leap year.");
		}
	}
}
/*
Enter the year
1800
The year 1800 is not a leap year.

Enter the year
400
The year 400 is leap year.

Enter the year
100
The year 100 is not a leap year.

Enter the year
200
The year 200 is not a leap year.

Enter the year
2000
The year 2000 is leap year.

Enter the year
2800
The year 2800 is leap year.
*/