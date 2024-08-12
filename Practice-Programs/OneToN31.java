//print 1 to n; n value get from the user
import java.util.Scanner;
class OneToN3
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
/*
Enter the n value:6
1
2
3
4
5
6
*/