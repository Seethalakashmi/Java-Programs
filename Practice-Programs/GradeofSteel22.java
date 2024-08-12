//to give grade of steel:(i)hardness>50(ii)carbon content<0.7(iii)tensile strength>5600; 3-true-->g-10;1,2-true-->g-9;2,3-true-->g-8;1,3-true-->g-7;only one-->g-6;no one-->g-5.
import java.util.Scanner;
class GradeofSteel22
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the hardness of the steel:");
		int hardness=sc.nextInt();
        System.out.println("Enter the carbon content in the steel:");
		double content=sc.nextDouble();
		System.out.println("Enter the tensile strength of the steel:");
		int tensile=sc.nextInt();
		int grade=0;
		if(hardness>50 && content<0.7 && tensile>5600)
           grade=10;
		else if(hardness>50 && content<0.7)
           grade=9;
		else if(content<0.7 && tensile>5600)
           grade=8;
		else if(hardness>50 && tensile>5600)
           grade=7;
		else if(hardness>50 || content<0.7 || tensile>5600)
           grade=6;
		else 
		   grade=5;
		System.out.println("your grade is: "+grade);
	}
}
/*
Enter the hardness of the steel:
56
Enter the carbon content in the steel:
1
Enter the tensile strength of the steel:
6778
your grade is: 7
*/
