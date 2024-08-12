// input month number and print month name in switch case
import java.util.Scanner;
class MonthSwitch12
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number between 1 to 12");
		int number=sc.nextInt();
		switch(number)
		{
			case 1:System.out.println("January");
			break;
			case 2:System.out.println("February");
			break;
			case 3:System.out.println("March");
			break;
			case 4:System.out.println("April");
			break;
			case 5:System.out.println("May");
			break;
			case 6:System.out.println("June");
			break;
			case 7:System.out.println("July");
			break;
			case 8:System.out.println("August");
			break;
			case 9:System.out.println("September");
			break;
			case 10:System.out.println("October");
			break;
			case 11:System.out.println("November");
			break;
			case 12:System.out.println("December");
			break;
			default:System.out.println("Invalid Selection");
			break;
		}
	}
}
/*
Enter the number between 1 to 12
13
Invalid Selection

Enter the number between 1 to 12
1
January

Enter the number between 1 to 12
11
November
*/