//print n to 1 in while loop;input from user.
import java.util.Scanner;
class NToOneWhile5 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();//n-4
		int start=n;
		while(1<=start)
			System.out.println(start--);
	}
}
/*
Enter the n value:4
4
3
2
1
*/