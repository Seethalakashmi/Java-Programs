//countdown is done here using thread.sleep help of throws exception
class CountDown10
{
	public static void main (String [] args) throws Exception
	{
		System.out.println("5");
		Thread.sleep(1000);
		System.out.println("4");
		Thread.sleep(1000);
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("BOOM");
	}
}
/* 
throws exception is must here then only thread.sleep works
5
4
3
2
1
BOOM
*/