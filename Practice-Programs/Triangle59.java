//To input angles of the triangle and check whether triangle is valid or not
import java.util.Scanner;
class Triangle4
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of angle 'a'");
		int a=sc.nextInt();
		System.out.println("Enter the value of angle 'b'");
		int b=sc.nextInt();
		System.out.println("Enter the value of angle 'c'");
		int c=sc.nextInt();
		int angle_sum=a+b+c;
		if(angle_sum==180 && a>0 && b>0 && c>0)
		{
			System.out.println("Sum of the angle is"+angle_sum);
			System.out.println("Triangle is valid.");
		}
		else 
		{
			System.out.println("Sum of the angle is:"+angle_sum);
			System.out.println("Triangle is not valid.");
		}
	}
}
/*
Enter the value of angle 'a'
60
Enter the value of angle 'b'
40
Enter the value of angle 'c'
90
Sum of the angle is:190
Triangle is not valid.
*/

/*Enter the value of angle 'a'
60
Enter the value of angle 'b'
40
Enter the value of angle 'c'
80
Sum of the angle is:180
Triangle is valid.
*/