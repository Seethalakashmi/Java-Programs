//print the table in reverse order;user input.
import java.util.Scanner;
class TablesReverse9 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		for(int i=10;i>=1;i--)
			System.out.println(n+"*"+i+"="+(n*i));
	}
}
/*
Enter the n value:5
5*10=50
5*9=45
5*8=40
5*7=35
5*6=30
5*5=25
5*4=20
5*3=15
5*2=10
5*1=5
*/