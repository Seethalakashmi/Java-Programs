//find the given number is armstrong number or not ex:153=1^3+5^3+3^3=1+125+27=153(equal to given number)
import java.util.Scanner;
class ArmStrongNum19 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(temp>0)
		{
			int lastDigit=temp%10;
			sum+=(lastDigit*lastDigit*lastDigit);
			temp=temp/10;
		}
		if(number==sum)
			System.out.println("Given number is armstrong number.");
		else
			System.out.println("Given number is not armstrong number.");
	}
}
/*
Enter the number:123
Given number is not armstrong number.

Enter the number:153
Given number is armstrong number.
*/