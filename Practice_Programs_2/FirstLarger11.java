//find the first largest number from the given numbers
import java.util.Scanner;
class FirstLarger15 
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
		int res=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println("Among:"+a+":"+b+":"+c);
		System.out.println("First Largest number is:"+res);
	}
}
/*
Enter the a value: 1212
Enter the b value: 12121
Enter the c value: 1121
Among:1212:12121:1121
First Largest number is:12121
*/