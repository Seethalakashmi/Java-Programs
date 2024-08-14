//find the given number is strong number or not ex:145=1!+4!+5!=1+24+120=145
import java.util.Scanner;
class StrongNumber20
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();//145
		int temp=number,sum=0;
		while(temp>0)
		{
			int lastDigit=temp%10;
			temp=temp/10;
			int fact=1;
			for (int i=1;i<=lastDigit ;i++ )
			{
			fact*=i;
			}
			sum+=fact;
		}
		if(number==sum)
			System.out.println("The given number is strong number.");
		else
			System.out.println("The given number is not a strong number.");
	}
}
/*
Enter the number:145
The given number is strong number.
Enter the number:123
The given number is not a strong number.
Enter the number:40585
The given number is strong number.
*/