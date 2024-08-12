//To find the square of the number in range
import java.util.Scanner;
class SquareInRange33 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the start value");
		int start=sc.nextInt();
		System.out.println("Enter the end value");
		int end=sc.nextInt();
		int square=1;
		for (int i=start;i<=end ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
			 square=i*i;
			}
			System.out.println("Square of the given "+i +" is: "+square);
		}
	}
}
/*
Enter the start value
1
Enter the end value
10
Square of the given 1 is: 1
Square of the given 2 is: 4
Square of the given 3 is: 9
Square of the given 4 is: 16
Square of the given 5 is: 25
Square of the given 6 is: 36
Square of the given 7 is: 49
Square of the given 8 is: 64
Square of the given 9 is: 81
Square of the given 10 is: 100
*/