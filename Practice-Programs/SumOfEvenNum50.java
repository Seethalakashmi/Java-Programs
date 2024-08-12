//sum the even numbers; input from user.
import java.util.Scanner;
class SumOfEvenNum25 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int sum=0;
		int sum1=0;
		for (int i=1;i<=n ;i++ )
		{   
			if(i%2==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("The sum of even numbers:"+sum);
		for (int i=1;i<=n ;i++ )
		{
			if(i%2!=0)
			{
			   System.out.println(i);
               sum1+=i;
			}
		}
		System.out.println("The sum of odd numbers:"+sum1);
    }
}
/*
Enter the n value:6
2
4
6
The sum of even numbers:12
1
3
5
The sum of odd numbers:9
*/