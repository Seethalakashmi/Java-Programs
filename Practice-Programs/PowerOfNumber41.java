//to find the value of one number raised to the power of another number.(x^n) i.e. 2^3=2x2x2
import java.util.Scanner;
class PowerOfNumber38 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the x value");
		double x=sc.nextDouble();
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++)
		{
			mul*=x;
		}
		System.out.println("Your answer is: "+mul);
	}
}
/*
Enter the x value
2
Enter the n value
5
Your answer is: 32*/
//ie 2^5=2x2x2x2x2=32