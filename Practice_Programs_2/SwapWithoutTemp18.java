//swap the numbers without using temporary variable
import java.util.Scanner;
class SwapWithoutTemp8
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the a value: ");
		int a=sc.nextInt();
		System.out.print("Enter the b value: ");
		int b=sc.nextInt();
		System.out.println("Before Swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
        a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
    }
}
/*
Enter the a value: 32
Enter the b value: 15
Before Swap:
a: 32
b: 15
After Swap:
a: 15
b: 32
*/