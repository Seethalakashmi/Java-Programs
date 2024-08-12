//to find the given number is perfect number or not.(sum of factors = given number)
import java.util.Scanner;
class PerfectNumber30
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
        //int temp=number;
		int sum=0;
		for (int i=1;i<number;i++)
		{
          if(number%i==0)
			{
				sum+=i;
			}
		}
		  if(sum==number)	
		  System.out.println("Given number is perfect number.");
		  else
		  System.out.println("Given number is not a perfect number.");
	}
}
/*Enter the number
6
Given number is perfect number.

D:\seetha\java_special\programs>java PerfectNumber30.java
Enter the number
123
Given number is not a perfect number.
*/