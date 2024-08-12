//to calculate salary;male(>=10-PG-15k;>=10-G-10k;<10-PG-10k;<10-G-7k);female(>=10-PG-12k;>=10-G-9k;<10-PG-10k;<10-G-6k)
import java.util.Scanner;
class SalaryCalculation20
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the gender:(m/f) ");
		char gender=sc.next().charAt(0);
		System.out.println("Enter the Year of service: ");
		int service=sc.nextInt();
		System.out.println("Enter the Qualification: 1.Post-Graduate 2.Graduate:");
        int qualification=sc.nextInt();
        long salary=0;
		if(gender=='m')
		{
			if(service>=10 && qualification==1)
			{
				salary=15000;//System.out.println("Your Salary is 15000.");
			}
			else if(service>=10 && qualification==2)
			{
				salary=10000;//System.out.println("Your Salary is 10000.");
			}
			else if(service<10 && qualification==1)
			{
				salary=10000;//System.out.println("Your Salary is 10000.");
			}
			else if(service<10 && qualification==2)
			{
				salary=7000;//System.out.println("Your Salary is 7000.");
			}
			System.out.println(salary);
		}
		else if(gender=='f')
		{
			if(service>=10 && qualification==1)
			{
				salary=12000;//System.out.println("Your Salary is 12000.");
			}
			else if(service>=10 && qualification==2)
			{
				salary=9000;//System.out.println("Your Salary is 9000.");
			}
			else if(service<10 && qualification==1)
			{
				salary=10000;//System.out.println("Your Salary is 10000.");
			}
			else if(service<10 && qualification==2)
			{
				salary=6000;//System.out.println("Your Salary is 6000.");
			}
			System.out.println("Your salary is: "+salary);
		}
		else
		{
			System.out.println("Invalid! Enter valid input.");
		}
	}
}
/*
Enter the gender:(m/f)
m
Enter the Year of service:
20
Enter the Qualification: 1.Post-Graduate 2.Graduate:
2
Your salary is:10000
Enter the gender:(m/f)
f
Enter the Year of service:
10
Enter the Qualification-1.Post-Graduate 2.Graduate:
1
Your salary is:12000
*/