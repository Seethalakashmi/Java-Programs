//guess the number
import java.util.Scanner;
class MagicNumber16
{  
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int magic_number=(int)(Math.random()*20);
		boolean repeat_my_app=true;
		do
		{
          System.out.println("Welcome to the Number Guessing Game....");
		  System.out.println("Enter your guess:");
		  int user_guess=sc.nextInt();
		  if(user_guess>magic_number)
          System.out.println("It is more than magic number.");
		  else if(user_guess<magic_number)
		  System.out.println("It is less than magic number.");
		  else
			{
		  System.out.println("****Great you got it:):"+magic_number+"***");
		  magic_number=(int)(Math.random()*20);
		  int count=0;
		  while(user_guess>0)
				{
					user_guess=user_guess/10;
					count++;
				}
		  System.out.println("Magic Number Count:"+ count);
		  System.out.println("Press any key to continue...");
		  System.out.println("Press 2 to quit.");
		  int choice=sc.nextInt();
		  if(choice==2)
			  repeat_my_app=false;
			}
		}
		while (repeat_my_app);
			}
}
/*
Welcome to the Number Guessing Game....
Enter your guess:
6
It is more than magic number.
Welcome to the Number Guessing Game....
Enter your guess:
5
It is more than magic number.
Welcome to the Number Guessing Game....
Enter your guess:
3
It is more than magic number.
Welcome to the Number Guessing Game....
Enter your guess:
1
It is less than magic number.
Welcome to the Number Guessing Game....
Enter your guess:
2
****Great you got it:):2***
Magic Number Count:1
Press any key to continue...
Press 2 to quit.
*/