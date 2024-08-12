//to check whether triangle is equilateral or isosceles, scalene
import java.util.Scanner;
class TriangleCheck13 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the length of 'ab':");
		int ab=sc.nextInt();
		System.out.println("Enter the length of 'bc':");
		int bc=sc.nextInt();
		System.out.println("Enter the length of 'ac':");
		int ac=sc.nextInt();
		if(ab==ac&&ab==bc)
			System.out.println("The triangle is equilateral.");
		else if(ab==ac||ab==bc||ac==bc)
			System.out.println("The triangle is isosceles.");
		else
			System.out.println("The triangle is scalene.");
	}
}
/*
Enter the length of 'ab':
11
Enter the length of 'bc':
11
Enter the length of 'ac':
13
The triangle is isosceles.

Enter the length of 'ab':
11
Enter the length of 'bc':
12
Enter the length of 'ac':
13
The triangle is scalene.

Enter the length of 'ab':

11
Enter the length of 'bc':
11
Enter the length of 'ac':
11
The triangle is equilateral.
*/