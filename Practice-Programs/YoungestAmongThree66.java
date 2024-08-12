//get the ages of ram,shyam and ajay then find who is youngest.
import java.util.Scanner;
class YoungestAmongThree21
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the age of ram: ");
		int ram=sc.nextInt();
		System.out.println("Enter the age of shyam: ");
		int shyam=sc.nextInt();
		System.out.println("Enter the age of ajay: ");
		int ajay=sc.nextInt();
		if(ram<shyam && ram<ajay)
			System.out.println("Ram is the youngest.");
        else if(shyam<ajay)
			System.out.println("Shyam is the youngest.");
        else
			System.out.println("Ajay is the youngest.");
	}
}
/*
Enter the age of ram:
12
Enter the age of shyam:
13
Enter the age of ajay:
14
Ram is the youngest.

Enter the age of ram:
89
Enter the age of shyam:
32
Enter the age of ajay:
6
Ajay is the youngest.

Enter the age of ram:
12
Enter the age of shyam:
3
Enter the age of ajay:
15
Shyam is the youngest.
*/