//to print the table;input from user.
import java.util.Scanner;
class Tables8
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}
}
/*
Enter the n value
5
5X1=5
5X2=10
5X3=15
5X4=20
5X5=25
5X6=30
5X7=35
5X8=40
5X9=45
5X10=50
*/