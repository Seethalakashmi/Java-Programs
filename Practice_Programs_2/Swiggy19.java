//Sample Swiggy application
import java.util.Scanner;
class Swiggy5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\tWelcome to \"Swiggy\"....");
		System.out.println("\n1.Buhari\n2.A2B\n3.Amma Canteen\n4.S.S.Hyderabad");
		System.out.println("\nSelect the Hotel:");
		int hotel=sc.nextInt();//hotel selection
		System.out.println("\t\tProcessing....");
		Thread.sleep(1000);
		switch(hotel)//hotel selection
		{
			case 1:{//Buhari
			System.out.println("\nYou are inside Buhari.");
            System.out.println("\nSelect Your Favorite Food");
			System.out.println("\n1.Mutton Biryani\n2.Chicken-65\n3.Prawn Biryani\n4.Mandi Biryani");
			int food=sc.nextInt();//1 or 2 or 3 or 4 and 5 means invalid
			System.out.println("\nProcessing and Selecting Food....");
			Thread.sleep(1000);
			double bill=0;
			switch(food)
				{//food switch open
				 case 1:{//Mutton Biryani
					 int price=350;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
							{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;
					 }
				 case 2:{//Chicken-65
                     int price=250;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 3:{//prawn biriyani
					 int price=400;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 4:{//mandi biryani
					 int price=450;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 default:{System.out.println("Sorry!Invalid Food Selection.");
					 break;}
				}// food switch close
			break;}//Buhari
			case 2:{//A2B
			System.out.println("\nYou are inside A2B.");
            System.out.println("\nSelect Your Favorite Food");
			System.out.println("\n1.Mushroom Tikka\n2.Gopi Lollipop\n3.Paneer Tikka\n4.Schezwan Fried Rice");
			int food=sc.nextInt();//1 or 2 or 3 or 4 and 5 means invalid
			System.out.println("\nProcessing and Selecting Food....");
			Thread.sleep(1000);
			double bill=0;
			switch(food)
				{//food switch open
				 case 1:{//Mushroom Tikka
					 int price=170;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for mushroom or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;
					 }
				 case 2:{//Gopi Lollipop
                     int price=172;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for lollipop or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 3:{//Paneer Tikka
					 int price=200;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 4:{//Schezwan Fried Rice 
					 int price=170;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for fried rice or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 default:{System.out.println("Sorry!Invalid Food Selection.");
					 break;}
				}// food switch close
			break;}//A2Bbreak;}//A2B
			case 3:{	//Amma Canteen
			System.out.println("\nYou are inside Amma Canteen.");
            System.out.println("\nSelect Your Favorite Food");
			System.out.println("\n1.Sambar rice\n2.Curd rice\n3.Lemon rice\n4.Tomato rice");
			int food=sc.nextInt();//1 or 2 or 3 or 4 and 5 means invalid
			System.out.println("\nProcessing and Selecting Food....");
			Thread.sleep(1000);
			double bill=0;
			switch(food)
				{//food switch open
				 case 1:{//Sambar rice
					 int price=40;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;
					 }
				 case 2:{//Curd rice
                     int price=25;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 3:{//Lemon rice
					 int price=30;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 4:{//Tomato rice
					 int price=45;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 default:{System.out.println("Sorry!Invalid Food Selection.");
					 break;}
				}
				break;}//Amma Canteen
			case 4:{	//Amma Canteen
			System.out.println("\nYou are inside S.S.Hyderabad....");
            System.out.println("\nSelect Your Favorite Food");
			System.out.println("\n1.Chicken Biryani\n2.Fish Biryani\n3.Gopi Fried rice\n4.Egg Fried rice");
			int food=sc.nextInt();//1 or 2 or 3 or 4 and 5 means invalid
			System.out.println("\nProcessing and Selecting Food....");
			Thread.sleep(1000);
			double bill=0;
			switch(food)
				{//food switch open
				 case 1:{//Chicken Biryani
					 int price=340;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;
					 }
				 case 2:{//Fish Biryani
                     int price=250;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 3:{//Gopi Fried rice
					 int price=180;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;//toatl amount for biryani or hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 case 4:{//Egg Fried rice
					 int price=195;
					 System.out.println("\nEnter the quantity:");
					 int qty=sc.nextInt();
                     bill=qty*price;// hotel bill amount
					 System.out.println("\nYour bill Amount is:"+bill);
					 System.out.println("\nSelect Your Payment Mode");
					 System.out.println("\n1.Gpay\n2.Phonepe");//payment mode
                     int payment_mode=sc.nextInt();
					 switch(payment_mode)
					 {//switch open
						case 1:{//case 1 open
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
								{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}//else close
							break;}//gpay
						case 2:{
							System.out.println("\nEnter the bill amount");
                            double user_amount=sc.nextDouble();//user bill amount
							System.out.println("\nEntered bill amount by you:"+user_amount);
                            if(bill==user_amount)
							{//if open and amount matched and otp gen
								System.out.println("Your Otp is: ");
								Thread.sleep(1000);
								System.out.println("Processing.....");
		                        int sys_otp=(int)(Math.random()*9999+9999);
		                        Thread.sleep(1000);
		                        System.out.println(sys_otp);
								System.out.println("Enter your otp");
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
								System.out.println("Thank You!Your order is received.");
								}
								else
							{//otp not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							}//if close
							else
							{//amount not matched and else open
							   System.out.println("\nSorry!Your order is failed.");								
							}
							break;}//phonepe
					 }
					 break;}
				 default:{System.out.println("Sorry!Invalid Food Selection.");
					 break;}
				}
				break;}//S.S.Hyderabad
			default:{System.out.println("Sorry!Invalid hotel selection");
				break;}
		}
	}
 }
/*
                Welcome to "Swiggy"....

1.Buhari
2.A2B
3.Amma Canteen
4.S.S.Hyderabad

Select the Hotel:
4
                Processing....

You are inside S.S.Hyderabad....

Select Your Favorite Food

1.Chicken Biryani
2.Fish Biryani
3.Gopi Fried rice
4.Egg Fried rice
4

Processing and Selecting Food....

Enter the quantity:
4

Your bill Amount is:780.0

Select Your Payment Mode

1.Gpay
2.Phonepe
2

Enter the bill amount
780

Entered bill amount by you:780.0
Your Otp is:
Processing.....
17831
Enter your otp
17831
Thank You!Your order is received.
*/