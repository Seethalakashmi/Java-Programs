//to find the given number is perfect number or not (in range ex 1 to 1000).
import java.util.Scanner;
class PerfectNumberRange31 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the start value: ");
		int start=sc.nextInt();
		System.out.print("Enter the end value: ");
		int end=sc.nextInt();
		for (int i=start;i<=end;i++)//2<=5
		{
			int number=i;
			int sum=0;
			for (int j=1;j<number;j++)//1<=2
			{
				if(number%j==0)
				sum+=j;     
			}
			if(number==sum)
			System.out.println(number +" : Perfect");
			//else
			//System.out.println(number+"Not Perfect");
		}
	}
}
/*
Enter the start value
1
Enter the end value 
100
6 :Perfect
28 :Perfect
*/