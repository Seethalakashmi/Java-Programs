//to find the given number is perfect square or not using formula
import java.util.Scanner;
class PerfectSquareInFormula36 
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int square_root=(int) (Math.sqrt(number));
		if(square_root*square_root==number)
		{
		System.out.println("Given number is perfect square.");
		}
		else
		{
			System.out.println("Given number is not perfect square. ");
		}
	}
}
/*
Enter the number
16
Given number is perfect square.

Enter the number
26
Given number is not perfect square.
*/