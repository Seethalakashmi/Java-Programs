//to create calculator.
import java.util.Scanner;
class Calculator12
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		boolean flag=true;
		do
		{
          System.out.println("Select the features");
		  System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		  int input=sc.nextInt();
		  switch(input)
			{
				case 1://Addition
					{
						System.out.println("Enter a:");
						int a=sc.nextInt();
						System.out.println("Enter b:");
						int b=sc.nextInt();
                        int res=add(a,b);
						System.out.println("The Addition of given numbers:"+res);
					    break;
					}
				case 2://Subtraction
					{
						System.out.println("Enter a:");
						int a=sc.nextInt();
						System.out.println("Enter b:");
						int b=sc.nextInt();
                        int res=sub(a,b);
						System.out.println("The Subtraction of given numbers:"+res);
					break;
					}
				case 3://Multiplication
					{
						System.out.println("Enter a:");
						int a=sc.nextInt();
						System.out.println("Enter b:");
						int b=sc.nextInt();
                        int res=mul(a,b);
						System.out.println("The Multiplication of given numbers:"+res);
					break;
					}
				case 4://Division
					{
						System.out.println("Enter a:");
						double a=sc.nextInt();
						System.out.println("Enter b:");
						double b=sc.nextInt();
                        double res=div(a,b);
						System.out.println("The Division of given numbers:"+res);
					break;
					}
				case 5://Exit
					{
                    flag=false;
					break;
					}
				default:
					{
					System.out.println("Invalid Selection.");
					break;
					}	
			}
		}
		while (flag);
		System.out.println("Thank you...");
	}
	public static int add(int a,int b)
	{
		return (a+b);
	}
	public static int sub(int a,int b)
	{
		return (a-b);
	}
	public static int mul(int a,int b)
	{
		return (a*b);
	}
	public static double div(double a,double b)
	{
		return(a/b);
	}
}
/*
Select the features

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
4
Enter a:
24
Enter b:
6
The Division of given numbers:4.0
Select the features

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
5
Thank you...
*/