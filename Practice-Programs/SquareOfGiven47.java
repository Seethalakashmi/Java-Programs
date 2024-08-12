//find the square of the given number
import java.util.Scanner;
class SquareOfGiven32
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int square=number*number;
        System.out.println("Square of the given number is: "+square);
	}
}
/*
Enter the number
12
Square of the given number is: 144
*/