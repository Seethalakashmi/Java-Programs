//count the digit of the given number
import java.util.Scanner;
class CountDigit1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int number=sc.nextInt();
		int temp=number;
		int lastDigit=0,count=0;
		while(temp>0)
		{
			lastDigit=temp%10;
			temp=temp/10;
			count++;
		}
		System.out.print("The Given Number count is: "+count);
	}
}
/*
Enter the number: 876543
The Given Number count is: 6
*/