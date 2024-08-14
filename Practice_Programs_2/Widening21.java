//convert the lower range data type into larger data type (i.e.widening)
class Widening18
{
	public static void main(String[] args) 
	{
      byte a=13;//byte-->long
	  long res=a;
	  System.out.println(a);
	  System.out.println(res);

      int b=4565;//int--->float
	  float res1=b;
	  System.out.println(b);
	  System.out.println(res1);

	  short d=78;//short--->long
	  long res3=d;
	  System.out.println(d);
	  System.out.println(res3);

	  int e=88979;//int--->long
	  long res4=e;	  
	  System.out.println(e);
	  System.out.println(res4);
	}
}
/*
13
13
4565
4565.0
78
78
88979
88979
*/