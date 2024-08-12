//to find given character is upper or lower
import java.util.Scanner;
class UpperLower11 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Alphabet");
		char letter=sc.next().charAt(0);
		if(letter>='a'&&letter<='z')
			System.out.println("The alphabet '"+letter+"' is lowercase.");
        else if(letter>='A'&&letter<='Z')
			System.out.println("The alphabet '"+letter+"' is uppercase.");
		else
			System.out.println("Invalid! Enter the correct alphabet.");
	}
}
/*
Enter the Alphabet
a
The alphabet 'a' is lowercase.

Enter the Alphabet
Z
The alphabet 'Z' is uppercase.

Enter the Alphabet
#
Invalid! Enter the correct alphabet.
*/