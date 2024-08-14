//convert the larger data type to smaller data type (i.e.Narrowing)
class Narrowing17
{
	public static void main(String[] args) 
	{
		long a=8776l;//long--->byte
	    byte res1=(byte)a;
		System.out.println(a);
		System.out.println(res1);

		float c=56.887f;//float--->int
		int res2=(int)c;
		System.out.println(c);
		System.out.println(res2);

		char d='A';//char--->byte
		byte res3=(byte)d;
		System.out.println(d);
		System.out.println(res3);

		double f=657.887;//double--->short
		short res4=(short)f;
		System.out.println(f);
		System.out.println(res4);

		long g=886l;//long--->int
		int res5=(int)g;
		System.out.println(g);
		System.out.println(res5);
	}
}
/*
8776
72
56.887
56
A
65
657.887
657
886
886
*/