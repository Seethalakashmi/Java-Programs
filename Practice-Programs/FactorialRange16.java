//print the factorial of the given number with in range.
import java.util.Scanner;
class FactorialRange28 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the start value:");
		int start=sc.nextInt();
		System.out.println("Enter the end value:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			int fact=1;
			for (int j=2;j<=i ;j++ )
			{
				fact*=j;
			}
		System.out.println("The factorial of "+i+" is: "+fact);
		}
	}
}
/*
Enter the start value:
2
Enter the end value:
5
The factorial of 2 is: 2
The factorial of 3 is: 6
The factorial of 4 is: 24
The factorial of 5 is: 120
*/