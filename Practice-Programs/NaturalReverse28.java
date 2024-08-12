//Print the natural number in reverse order.
import java.util.Scanner;
class  NaturalReverse1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
/*
Enter the n value
12

12
11
10
9
8
7
6
5
4
3
2
1
*/