//to find the palindrome number in range
import java.util.Scanner;
class PalindromeInRange40 
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
			int temp=i;
			int res=0;
			while(temp>0)
			{
			int last_digit=temp%10;
			res=last_digit+res*10;
			temp=temp/10;
			}
			if(i==res)
			{
				System.out.print(" "+i);
			}
		}
	}
}
/*
Enter the start value: 100
Enter the end value: 300
 101 111 121 131 141 151 161 171 181 191 202 212 222 232 242 252 262 272 282 292
 */