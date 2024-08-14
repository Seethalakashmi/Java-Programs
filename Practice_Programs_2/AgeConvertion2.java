//give the age in integer and get output in words
import java.util.Scanner;
class AgeConvertion4
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Age: ");
		int res=sc.nextInt();
		if(res==1)
		{
		System.out.println("Entered age is: One");
		}
		if(res==2)
		{
		System.out.println("Entered age is: Two");
		}
		if(res==3)
		{
		System.out.println("Entered age is: Three");
		}
		if(res==4)
		{
		System.out.println("Entered age is: Four");
		}
		if(res==5)
		{
		System.out.println("Entered age is: Five");
		}
		if(res<1||res>5)
		{
		System.out.println("\nInvalid!");
		}
	}
}
/*
Enter Your Age:
4
Entered age is: Four
*/