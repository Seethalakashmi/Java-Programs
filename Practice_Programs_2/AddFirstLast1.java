//Add first and last digit of the given number
import java.util.Scanner;
class AddFirstLast3 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int number=sc.nextInt();
		int lastDigit=number%10,sum=0;
		while(number>9)
		{
			number=number/10;
		}
		sum=lastDigit+number;
		System.out.println("The Sum of the first and Last digit is: "+sum);
	}
}
/*
Enter the number: 78899229
The Sum of the first and Last digit is: 16
*/