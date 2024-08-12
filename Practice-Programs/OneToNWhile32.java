//print 1 to n in while loop;input from user
import java.util.Scanner;
class OneToNWhile4
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int start=1;
		while(start<=n)//n-4
		{
			System.out.println(start++);
		}
	}
}
/*
Enter the n value:4
1
2
3
4
*/