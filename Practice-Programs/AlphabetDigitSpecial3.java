//to input any character & check whether it is alphabet,digit or special character
import java.util.Scanner;
class AlphabetDigitSpecial10
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] agrs)
	{
		System.out.println("Enter the input");
		char ch=sc.next().charAt(0);
		int value=ch;
		if(value>='0' && value<='9')
			System.out.println("Your are entered the number.");
		else if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
            System.out.println("You are entered the Alphabet.");
		else
            System.out.println("You are entered the special character.");
	}

}
/*

Enter the input
11
You are entered the number.

Enter the input
A
You are entered the Alphabet.

Enter the input
g
You are entered the Alphabet.
*/