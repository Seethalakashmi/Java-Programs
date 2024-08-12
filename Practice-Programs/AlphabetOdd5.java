//print alphabet in odd position.
class AlphabetOdd16
{
	public static void main(String[] args) 
	{
		for(char i='A';i<='Z';i++)//upper case in ascending order
		{
			if(i%2!=0)
			System.out.print(i+"-"+(int) i+" ");
		}
		System.out.println();
		for(char i='z';i>='a';i--)//lower case in descending order
		{
			if(i%2!=0)
			System.out.print(i+"-"+(int) i+" ");
		}
		System.out.println();
	}
}
/*
A-65 C-67 E-69 G-71 I-73 K-75 M-77 O-79 Q-81 S-83 U-85 W-87 Y-89
y-121 w-119 u-117 s-115 q-113 o-111 m-109 k-107 i-105 g-103 e-101 c-99 a-97
*/