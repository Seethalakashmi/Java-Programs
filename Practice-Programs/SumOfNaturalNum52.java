//sum the all natural numbers given by user.
import java.util.Scanner;
class SumOfNaturalNum24 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
         sum+=i;
		 System.out.print(i+" ");
		}
		System.out.println("\nSum of all natural number is: "+sum);
	}
}
/*
Enter the n value:10
1 2 3 4 5 6 7 8 9 10
Sum of all natural number is: 55
*/