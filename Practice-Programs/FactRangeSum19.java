//find factorial and sum of the given number in range.
import java.util.Scanner;
class FactRangeSum29 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the start value:");
		int start=sc.nextInt();
		System.out.print("Enter the end value:");
		int end=sc.nextInt();
		int sum=0;
		for (int i=start;i<=end ;i++)
		{
			int fact=1;
			for (int j=2;j<=i ;j++)
			{	
				fact*=j;
			}
		    sum+=fact;
		    System.out.println("The factorial of "+i+" is: "+fact);
		}
		System.out.println("The sum of factorial of given number is:" +sum);
	}
}
/*
Enter the start value:2
Enter the end value:5
The factorial of 2 is: 2
The factorial of 3 is: 6
The factorial of 4 is: 24
The factorial of 5 is: 120
The sum of factorial of given number is:152
*/