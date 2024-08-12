//print 1 to 20 and skip 5,8,12,18
class SkipNumber20
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=20;i++)
		{
			if(i==5)
				continue;
			if(i==8)
				continue;
			if(i==12)
				continue;
			if(i==18)
				continue;
			System.out.print(i+" ");
		}
	}
}
/*
1 2 3 4 6 7 9 10 11 13 14 15 16 17 19 20
*///except 5,8,12,18 others are printed.