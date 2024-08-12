//to find the given number is perfect square or not find in range(ex 1 to 100)
import java.util.Scanner;
class PerfectSquareInRange35 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the start value: ");
		int start=sc.nextInt();
		System.out.print("Enter the end value: ");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			  int s=0;
              while(s*s<i)
				{
					s++;
				}
			  if(s*s==i)
				{
					System.out.println("The number "+i+" is Perfect Square of "+s);
				}
		}
	}
}
/*
Enter the start value: 1
Enter the end value: 100
The number 1 is Perfect Square of 1
The number 4 is Perfect Square of 2
The number 9 is Perfect Square of 3
The number 16 is Perfect Square of 4
The number 25 is Perfect Square of 5
The number 36 is Perfect Square of 6
The number 49 is Perfect Square of 7
The number 64 is Perfect Square of 8
The number 81 is Perfect Square of 9
The number 100 is Perfect Square of 10
*/