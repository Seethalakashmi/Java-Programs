//to check a number divisible by 5 and 10 or not.if divisible print development r testing
import java.util.Scanner;
class DivisibleByFiveTen3 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number>0)
		{
			if(number%5==0 && number%10==0)
			{
				System.out.println("This number is divisible by 5 and 10.");
				System.out.println("You are eligible for Development.");
			}
			else
			{
				System.out.println("This number is not divisible by 5 and 10.");
				System.out.println("You are eligible for Testing.");
			}
		}
		else
			System.out.println("invalid number");
	}
}
/*
Enter the number
50
This number is divisible by 5 and 10.
You are eligible for Development.

Enter the number
45
This number is not divisible by 5 and 10.
You are eligible for Testing.
*/