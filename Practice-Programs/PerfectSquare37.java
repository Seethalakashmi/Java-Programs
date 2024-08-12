//find the given number is perfect square or not.
import java.util.Scanner;
class PerfectSquare34
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number>0)
		{
			int i=0;
			while(i*i<number)
			{
			i++;
			}
			if(i*i==number)
				System.out.println("Given number is Perfect Square.");
			else
				System.out.println("Given number is not Perfect Square.");
		}
		else
		{
		System.out.println("Not valid");
		}
	}
}
/*
Enter the number
4
Given number is Perfect Square.

Enter the number
2
Given number is not Perfect Square.

Enter the number
0
Not valid
*/