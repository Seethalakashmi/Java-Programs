 //find number of even number present in given input
 import java.util.Scanner;
 class Count
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 3 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int count=0;
		//if(a%2==0)
		//count++;
		count=a%2==0?count+1:count;
		count=b%2==0?count+1:count;
		count=c%2==0?count+1:count;
		switch (count)
		{
		case 1:{System.out.println("Case1:"+count);
		break;}
		case 2:{System.out.println("Case2:"+count);
			break;}
		case 3:{System.out.println("Case3:"+count);
			break;}
		default:{System.out.println("Invalid");
			break;}
		}
	}
}
/*
Enter 3 numbers:
2
4
6
Case3:3
Enter 3 numbers:
1
4
3
Enter 3 numbers:
Case1:1
1
5
3
invalid
Enter 3 numbers:
2
7
8
Case2:2
*/