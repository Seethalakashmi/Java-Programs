//find the bill amount for purchasing n number of chocolate by customer.
import java.util.Scanner;
class  Chocolate13
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of Chocolate");
		int qty=sc.nextInt();
		int ep=5;
		double amount=0;
		amount=qty*ep;
		if(qty>=1 && qty<=99)
		{
			if(qty>=50 &&qty<=99)
			{
			double bill=amount-(amount*1/100);
			System.out.println("You should pay:"+bill);
			}
			else
			{
			System.out.println("You should pay:"+amount);
			}
		}
		else if(qty==100 && qty<=499)
		{
			double bill=amount-(amount*2/100);
			System.out.println("You should pay:"+bill);
		}
		else 
		{
			double bill=amount-(amount*50/100);
			System.out.println("You should pay:"+bill);
		}
	}
} 
/*
Enter the number of Chocolate
1
You should pay:5.0
Enter the number of Chocolate
50
You should pay:247.5
Enter the number of Chocolate
99
You should pay:490.05
Enter the number of Chocolate
100
You should pay:490.0
Enter the number of Chocolate
155
You should pay:387.5
*/
