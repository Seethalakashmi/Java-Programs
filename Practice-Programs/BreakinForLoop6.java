//use break in for loop
class BreakinForLoop18 
{
	public static void main(String[] args) 
	{
		for(int i=100;i>=1;i--)
		{
			if(i==50)//after 50 no other numbers are printed.
		{
			break;
		}
		System.out.print(i+" ");
		}
	}
}
/*100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51*/