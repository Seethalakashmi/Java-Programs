//to read % dispaly grade accordingly[>=90%-->A;>=80%-->B;>=70%-->C;>=60%-->D;>=40%-->E;<40%-->F
import java.util.Scanner;
class Grade8
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Percentage:");
		double percentage=sc.nextDouble();
		if(percentage>0 && percentage<=100)
		{
		if(percentage>=90)
		System.out.println("Your Grade is 'A'.");
		else if(percentage>=80)
		System.out.println("Your Grade is 'B'.");
        else if(percentage>=70)
		System.out.println("Your Grade is 'C'.");
		else if(percentage>=60)
		System.out.println("Your Grade is 'D'.");
		else if(percentage>=40)
		System.out.println("Your Grade is 'E'.");
		else if(percentage<40)
		System.out.println("Your Grade is 'F'.");
		}
		else
		System.out.println("Invalid! Enter valid percentage.");
	}
}
/*
Enter the Percentage:
0
Invalid! Enter valid percentage.

Enter the Percentage:
1
Your Grade is 'F'.

Enter the Percentage:
-10
Invalid! Enter valid percentage.

Enter the Percentage:
101
Invalid! Enter valid percentage.
*/