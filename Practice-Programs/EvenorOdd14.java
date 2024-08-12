//To check whether a number is even or odd
import java.util.Scanner;
class EvenorOdd5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("The number "+ number +" is even.");
		}
		else
		{
			System.out.println("The number "+ number +" is odd.");
		}
	}
}
/*
Enter the number
111
The number 111 is odd.

Enter the number
112
The number 112 is even.
*/
