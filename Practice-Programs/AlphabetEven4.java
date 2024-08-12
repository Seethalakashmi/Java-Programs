//print alphabet in even position.
class AlphabetEven17
{
	public static void main(String[] args) 
	{
		for(char i='A';i<='Z';i++)//upper case in ascending order
		{
			if(i%2==0)
			System.out.print(i+"-"+(int) i+" ");
		}
		System.out.println();
		for(char i='z';i>='a';i--)//lower case in decending order
		{
			if(i%2==0)
			System.out.print(i+"-"+(int) i+" ");
		}
		System.out.println();
	}
}
/*
B-66 D-68 F-70 H-72 J-74 L-76 N-78 P-80 R-82 T-84 V-86 X-88 Z-90
z-122 x-120 v-118 t-116 r-114 p-112 n-110 l-108 j-106 h-104 f-102 d-100 b-98
*/