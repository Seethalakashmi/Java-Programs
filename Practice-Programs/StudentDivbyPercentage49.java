//read 5 sub mark and calculate % and to display marks and division according to student percentage >=60%-->1st div;50-59-->2nd div;40-49-->3rd div;<40-->fail.
import java.util.Scanner;
class StudentDivbyPercentage16
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Tamil mark");
		int tamil=sc.nextInt();
		System.out.println("Enter the English mark");
		int english=sc.nextInt();
		System.out.println("Enter the Maths mark");
		int maths=sc.nextInt();
		System.out.println("Enter the Science mark");
		int science=sc.nextInt();
		System.out.println("Enter the Social mark");
		int social=sc.nextInt();
		int sum=tamil+english+maths+science+social;
		double percentage=sum/5;
		System.out.println("Your tamil mark:"+tamil);
		System.out.println("Your english mark:"+english);
		System.out.println("Your maths mark:"+maths);
		System.out.println("Your science mark:"+science);
		System.out.println("Your social mark:"+social);
		System.out.println("Your total mark:"+sum);
		System.out.println("Your percentage:"+percentage);
		if(percentage>=60 && percentage<=100)
			System.out.println("Your are under first division.");
        else if(percentage>=50 && percentage<=59)
			System.out.println("Your are under second division.");
		else if(percentage>=40 && percentage<=49)
			System.out.println("Your are under third division.");
		else if(percentage>0 && percentage<40)
			System.out.println("Your are fail");
		else 
			System.out.println("Invalid");
	}
}
/*
Enter the Tamil mark
90
Enter the English mark
80
Enter the Maths mark
90
Enter the Science mark
90
Enter the Social mark
90
Your tamil mark:90
Your english mark:80
Your maths mark:90
Your science mark:90
Your social mark:90
Your total mark:440
Your percentage:88.0
Your are under first division.
*/
