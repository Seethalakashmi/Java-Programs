//write the fibonacci series upto 10 digits.
import java.util.Scanner;
class Fibonacci2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the count: ");
		int number=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.print("Fibonacci Series:"+ n1+" "+n2);
		for (int i=3;i<=number;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
/*
Enter the count: 10
Fibonacci Series:0 1 1 2 3 5 8 13 21 34
*/