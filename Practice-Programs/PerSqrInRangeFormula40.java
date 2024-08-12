//Given number in range, to find which number is perfect square using formula
import java.util.Scanner;
class PerSqrInRangeFormula37 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the start value: ");
		int start=sc.nextInt();
		System.out.print("Enter the end value: ");
		int end=sc.nextInt();
		for (int i=start;i<=end ;i++ )
		{
			int sqrt_root=(int) (Math.sqrt(i));
			if(sqrt_root*sqrt_root==i)
				System.out.println("Given number "+i+" is perfect square.");
		}
	}
}
/*
Enter the start value: 1
Enter the end value: 50
Given number 1 is perfect square.
Given number 4 is perfect square.
Given number 9 is perfect square.
Given number 16 is perfect square.
Given number 25 is perfect square.
Given number 36 is perfect square.
Given number 49 is perfect square.
*/