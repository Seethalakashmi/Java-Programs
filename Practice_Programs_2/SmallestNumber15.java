//find the smallest number among four numbers
import java.util.Scanner;
class SmallestNumber17 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the a value: ");
		int a=sc.nextInt();
		System.out.print("Enter the b value: ");
		int b=sc.nextInt();
		System.out.print("Enter the c value: ");
		int c=sc.nextInt();
		System.out.print("Enter the d value: ");
		int d=sc.nextInt();
		int res=(a<b&&a<c&&a<d)?a:(b<c&&b<d)?b:(c<d)?c:d;
		System.out.println("The Given Numbers are: "+a+":"+b+":"+c+":"+d);
		System.out.println("The Smallest Number is: "+res);
	}
}
/*
Enter the a value: 121
Enter the b value: 232
Enter the c value: 222
Enter the d value: 111
The Given Numbers are: 121:232:222:111
The Smallest Number is: 111
*/