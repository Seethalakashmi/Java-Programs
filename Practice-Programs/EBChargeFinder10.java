//to input EB unit charge & find EB bill.<=50unit-->0.50/unit;<=150-->0.75/unit;<=250-->1.20/unit;>250-->1.50/unit;additional tax = 20 % added to bill
import java.util.Scanner;
class EBChargeFinder14
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the unit");
		double unit=sc.nextDouble();
		double bill=0;
		if(unit>0 && unit<=50)
			System.out.println("Your bill amount is:"+(bill=(unit*0.50)+(unit*0.50*20/100)));
		if(unit>50 && unit<=150)
			System.out.println("Your bill amount is:"+(bill=(unit*0.75)+(unit*0.75*20/100)));
		if(unit>150 && unit<=250)
			System.out.println("Your bill amount is:"+(bill=(unit*1.20)+(unit*1.20*20/100)));
		if(unit>=250)
			System.out.println("Your bill amount is:"+(bill=(unit*1.50)+(unit*1.50*20/100)));
	}
}
/*
Enter the unit
12
Your bill amount is:7.2

Enter the unit
251
Your bill amount is:451.8

Enter the unit
120
Your bill amount is:108.0
*/