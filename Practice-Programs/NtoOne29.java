//print n to 1 input get from user.
import java.util.Scanner;
class NtoOne1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		System.out.println(i);
	}
}
/*
Enter the n value:5
5
4
3
2
1
*/