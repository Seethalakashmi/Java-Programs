//print the tables in reverse order and also reverse in range;input from user.
import java.util.Scanner;
class TablesRangeRev11 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the start value:");
		int start=sc.nextInt();
		System.out.print("Enter the end value:");
		int end=sc.nextInt();
		for(int i=end;i>=start;i--)
		{
			for(int j=10;j>=1;j--)
				System.out.println(i+"*"+j+"="+(i*j));
		}
	}
}
/*
Enter the start value:3
Enter the end value:4
4*10=40
4*9=36
4*8=32
4*7=28
4*6=24
4*5=20
4*4=16
4*3=12
4*2=8
4*1=4
3*10=30
3*9=27
3*8=24
3*7=21
3*6=18
3*5=15
3*4=12
3*3=9
3*2=6
3*1=3
*/