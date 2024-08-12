//find gcd of given numbers, input from user.
import java.util.Scanner;
class GcdTwo23 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		int first=sc.nextInt();
		System.out.println("Enter the second number");
		int second=sc.nextInt();
		int gcd=1;
		for(int i=1;i<=first && i<=second;i++)
		{
			if(first%i==0 && second%i==0)
			{
              gcd=i;
			}
		}
		System.out.print("Gcd of two number is:"+gcd+"");
	}
}
/*
Enter the first number
8
Enter the second number
12
Gcd of two number is:4
*/