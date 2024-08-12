//print the tables in range;input from user.
import java.util.Scanner;
class TablesInRange10 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the start value:");
		int start=sc.nextInt();
		System.out.print("Enter the end value:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			for(int j=1;j<=10;j++)
				System.out.println(i+"X"+j+"="+(i*j));
		}
	}
}
/*
Enter the start value:2
Enter the end value:4
2X1=2
2X2=4
2X3=6
2X4=8
2X5=10
2X6=12
2X7=14
2X8=16
2X9=18
2X10=20
3X1=3
3X2=6
3X3=9
3X4=12
3X5=15
3X6=18
3X7=21
3X8=24
3X9=27
3X10=30
4X1=4
4X2=8
4X3=12
4X4=16
4X5=20
4X6=24
4X7=28
4X8=32
4X9=36
4X10=40
*/