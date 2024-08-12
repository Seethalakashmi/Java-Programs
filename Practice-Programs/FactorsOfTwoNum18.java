//find factors of two numbers.
import java.util.Scanner;
class FactorsOfTwoNum22
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		int first=sc.nextInt();	
		System.out.println("Enter the second number");
		int second=sc.nextInt();
		for(int i=1;i<=first && i<=second;i++)
		{
			System.out.print(i+",");
		}
	}
}
/*
Enter the first number
4
Enter the second number
8
1,2,3,4
*/