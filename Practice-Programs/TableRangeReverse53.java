//to print tables in range in reverse order.
import java.util.Scanner;
class TableRangeReverse14 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter start value:");
		int start=sc.nextInt();
		System.out.println("Enter end value:");
		int end=sc.nextInt();
		for(int i=10;i>=1;i--)
		{
			for(int j=end;j>=start;j--)
			{
			System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println(" ");
		}
	}
}
/*
Enter start value:
2
Enter end value:
4
4*10=40 3*10=30 2*10=20
4*9=36  3*9=27  2*9=18
4*8=32  3*8=24  2*8=16
4*7=28  3*7=21  2*7=14
4*6=24  3*6=18  2*6=12
4*5=20  3*5=15  2*5=10
4*4=16  3*4=12  2*4=8
4*3=12  3*3=9   2*3=6
4*2=8   3*2=6   2*2=4
4*1=4   3*1=3   2*1=2
*/