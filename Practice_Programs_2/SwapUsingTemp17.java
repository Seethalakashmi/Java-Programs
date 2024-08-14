//swap the numbers using temporary variable
import java.util.Scanner;
class SwapUsingTemp7 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the a value: ");
		int a=sc.nextInt();
		System.out.println("Enter the b value: ");
		int b=sc.nextInt();
		System.out.println("Before Swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
/*
Enter the a value:
10
Enter the b value:
20
Before Swap:
a: 10
b: 20
After Swap:
a: 20
b: 10
*/