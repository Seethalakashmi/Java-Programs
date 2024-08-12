//print the table in range in row by row.
import java.util.Scanner;
class TableRowByRow12
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("Enter the start value:");
		int start=sc.nextInt();
		System.out.print("Enter the end value:");
		int end=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			for(int j=start;j<=end;j++)
			{
				System.out.print(j+"*"+i +"="+(i*j)+"\t");//must use print stmt.
				Thread.sleep(500);
			}
			System.out.println(" ");//must use println stmt.
		}
	}
}
/*
Enter the start value:2
Enter the end value:4
2*1=2 3*1=3 4*1=4
2*2=4 3*2=6 4*2=8
2*3=6 3*3=9 4*3=12
2*4=8 3*4=12 4*4=16
2*5=10 3*5=15 4*5=20
2*6=12 3*6=18 4*6=24
2*7=14 3*7=21 4*7=28
2*8=16 3*8=24 4*8=32
2*9=18 3*9=27 4*9=36
2*10=20 3*10=30 4*10=40
*/