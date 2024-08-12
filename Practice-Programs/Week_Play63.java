 //mon,wed-basket ball;tues,fri-tennis,thurs-cricket,sat-exercise;sun-holiday
 import java.util.Scanner;
 class Week_Play
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      System.out.println("Enter the day in lowercase:");
	  String day=sc.next();
	  switch(day){
		  case "monday": 
          case "wednesday": System.out.println("Basket Ball");
		break;
		  case "tuesday": 
		  case "friday": System.out.println("Tennis");
		break;
		  case "thursday": System.out.println("Cricket");
		break;
		  case "saturday": System.out.println("Exercise");
		break;
		  case "sunday": System.out.println("Holiday");
		  break;
		default:
              System.out.println("Invalid");
		break;
	  }
	}
}
/*
Enter the day in lowercase:
monday
Basket Ball
*/