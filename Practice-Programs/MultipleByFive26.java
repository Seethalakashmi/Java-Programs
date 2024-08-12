//to check given integer is multiple of 5.
import java.util.Scanner;
class MultipleByFive27 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(number%5==0)
			System.out.println("The given number "+number+" is divisible by five.");
		else
            System.out.println("The given number "+number+" is not divisible by five.");
	}
}
/*
Enter the number:
12
The given number 12 is not divisible by five.

Enter the number:
15
The given number 15 is divisible by five.
*/