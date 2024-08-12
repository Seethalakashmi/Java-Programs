//to any alphabet & check whether it is vowel or consonent.
import java.util.Scanner;
class VowelConsonent9
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Entered character "+ch+" is vowel.");
		else if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("Entered character "+ch+" is vowel.");
		else
            System.out.println("Entered character "+ch+" is consonent.");
	}
}
/*
Enter the Character
q
Entered character q is consonent.

Enter the Character
A
Entered character A is vowel.

Enter the Character
a
Entered character a is vowel.

Enter the Character
G
Entered character G is consonent.
*/
