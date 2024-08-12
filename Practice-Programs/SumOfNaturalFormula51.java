//Sum of all natural number using formula;n*(n+1)/2;
import java.util.Scanner;
class SumOfNaturalFormula26 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int res=(n*(n+1)/2);
		System.out.println(res);
	}
}
/*
Enter the n value:6
21
*/