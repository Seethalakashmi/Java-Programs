//Print week days using switch case
import java.util.Scanner;
class WeekDays2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number from 1 to 7");
		int number=sc.nextInt();
		switch(number)
		{
			case 1:
			    System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
			    System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid");
				break;
			}
		}
	}

/*
Enter the number from 1 to 7
1
Sunday

Enter the number from 1 to 7
7
Saturday

Enter the number from 1 to 7
8
Invalid
*/