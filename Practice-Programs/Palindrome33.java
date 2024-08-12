//to check the given number is palindrome or not.
import java.util.Scanner;
class Palindrome39
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int temp=number;
		int res=0;
		while(number>0)
		{
		   int last_Digit=number%10;
		   res=last_Digit+res*10;
		   number/=10;
		}
		if(temp==res)
		System.out.println("Given number is palindrome.");
		else
			System.out.println("Given number is not palindrome.");
	}
}
/*
Enter the number
123
Given number is not palindrome.

Enter the number
15551
Given number is palindrome.
*/