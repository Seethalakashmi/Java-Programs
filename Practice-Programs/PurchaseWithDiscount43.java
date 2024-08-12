//while purchasing certain items >=100 &offer 10%,find total expenses. 
import java.util.Scanner;
class PurchaseWithDiscount15
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Quantity:");
		int quantity=sc.nextInt();
        System.out.print("Enter the each product price:");
		double price=sc.nextDouble();
		double bill=0;
		if(quantity>0 && quantity<=99)
		{
			bill=(quantity*price);
			System.out.println("Your expenses is: "+bill);
		}
        else if(quantity>99)
		{
			double amount=(quantity*price);
		    bill=amount - (amount*10/100);
			System.out.println("Your expenses is: "+bill);
		}
	}
}
/*
Enter the Quantity:100
Enter the each product price:10
Your expenses is: 900.0

Enter the Quantity:90
Enter the each product price:10
Your expenses is: 900.0
*/