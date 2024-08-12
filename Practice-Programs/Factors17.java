//to find factors of the given number.
class Factors21
{
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			System.out.println(i);
		}
	}
}
/* 
1
2
5
10
*/