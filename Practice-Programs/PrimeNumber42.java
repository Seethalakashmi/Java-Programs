//to find the given number is prime number or not.
import java.util.Scanner;
class PrimeNumber41
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		String res="It is a Prime Number.";
		if(number==0 || number==1)
		{
			res="Neither Prime nor Composite.";
		}
		else if(number>1)
		{
			for (int i=2;i<number;i++ )
			{
               if(number%i==0)
			   res="It is not a Prime Number.";
			}
		}
		else
		{
			res="Invalid.";
		}
		System.out.println(res);
	}
}
/*
Enter the number
1
Neither Prime nor Composite.

Enter the number
0
Neither Prime nor Composite.

Enter the number
-2
Invalid.

Enter the number
7
It is a Prime Number.

Enter the number
17
It is a Prime Number.

Enter the number
248
It is not a Prime Number.
*/