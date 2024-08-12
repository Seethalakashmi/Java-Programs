//Get three numbers and check all three are equal or not.
import java.util.Scanner;
class EqualorNot25
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		if(a==b&&a==c)
		System.out.println("Entered numbers are equal.");	
		else
		System.out.println("Entered numbers are not equal.");	
	}
}
/*
Enter the first number
11
Enter the second number
12
Enter the third number
12
Entered numbers are not equal.

Enter the first number
11
Enter the second number
11
Enter the third number
11
Entered numbers are equal.
*/