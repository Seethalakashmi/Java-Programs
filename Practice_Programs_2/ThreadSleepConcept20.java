//Print the train details and use thread concept
class ThreadSleepConcept6 
{
		public static void main(String[] args) throws Exception
	{
	    String name="Kamban Express";
		String route="Karaikal to Chennai Egmore";
        long number=16176l;
		int com=25;
		float time=10.00f;
		System.out.println("\t\tTrain Details");
		System.out.println("\t\t________________");
		Thread.sleep(1000);
		System.out.println("\tTrain Name:"+name);
		Thread.sleep(1000);
		System.out.println("\tNumber:"+number);
		Thread.sleep(1000);
		System.out.println("\tRoute:"+route);
		Thread.sleep(1000);
		System.out.println("\tNo.of.Compartments:"+com);
		Thread.sleep(1000);
		System.out.println("\tTimings:"+time+"PM");
	}
}
/*
                Train Details
                ________________
        Train Name:Kamban Express
        Number:16176
        Route:Karaikal to Chennai Egmore
        No.of.Compartments:25
        Timings:10.0PM
*/