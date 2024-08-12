//print name input given by user
import java.util.Scanner;
class Name2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of time you want to print your name:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		System.out.println(i+"-Lakshana");
	}
}
/*
Enter the number of time you want to print your name:
5
1-Lakshana
2-Lakshana
3-Lakshana
4-Lakshana
5-Lakshana
*/