//print factorial of given number.
import java.util.Scanner;
class Factorial27 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int n=sc.nextInt();
		int fact=1;
		for (int i=2;i<=n ; i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}
/*
Enter the number: 5
120
*/