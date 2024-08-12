//to check whether a character is alphabet or not.
import java.util.Scanner;
class Alphabet7
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z'||ch>='a' && ch<='z')
		{
		 System.out.println(ch+" is alphabet");
		}
		else
		{
		 System.out.println(ch+" is not alphabet");
		}
	}
}
/*
Enter the character
a
a is alphabet

Enter the character
v
v is alphabet

Enter the character
1
1 is not alphabet

Enter the character
@
@ is not alphabet

Enter the character
G
G is alphabet
*/