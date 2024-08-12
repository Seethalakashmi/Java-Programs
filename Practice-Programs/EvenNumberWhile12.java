//print only even number from 1 to n in while loop;input from user.
import java.util.Scanner;
class EvenNumberWhile6
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int start=1;
		while(start<=n)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
/*
Enter the n value:8
2
4
6
8
*/
