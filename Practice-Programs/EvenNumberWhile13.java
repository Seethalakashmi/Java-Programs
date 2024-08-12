//print only even number from n to 1 in while loop;input from user.
import java.util.Scanner;
class EvenNumberWhile7
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int start=n;
		while(start>=1)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			start--;
		}
	}
}
/*
Enter the n value:8
8
6
4
2
*/
