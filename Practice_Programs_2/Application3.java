//write the java program for two application
import java.util.Scanner;
class Application11
{
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) throws Exception
	{
		System.out.println("Select the Application: ");
		System.out.println("\n1.Facebook\n2.Instagram ");
		int app=sc.nextInt();//app selection
		switch(app)
		{
		case 1:
		{
			System.out.println("Welcome to Facebook.");
		    System.out.println("\n1.Email\n2.Password\n3.Change Password");
			int fb_select=sc.nextInt();//fb selection
			String email="Seetha123@gmail.com";
			int pwd=87438;
			switch(fb_select)
				{			 
			 case 1:{
				      System.out.println("Your Facebook email id is:"+email);
				      break;
				    }
			 case 2:{
				 	  System.out.println("Your Facebook Password is:"+pwd);
        			  break;
					}
			 case 3:{ int sys_otp=(int)(Math.random()*9999+9999);
			          System.out.println("Your otp is:"+sys_otp); 
					  System.out.println("Enter the otp:");
			          int otp=sc.nextInt();
					  if(sys_otp==otp)
					  System.out.println("Your entered otp is correct.");
					  System.out.println("\nEnter new password");
					  pwd=sc.nextInt();
					  System.out.println("Your New Password is:"+pwd);
					  System.out.println("Processing...");
					  Thread.sleep(2000);
					  System.out.println("Your Password is changed sucessfully");
			          break;
				    }
			          default:
					  {
				      System.out.println("Invalid Selection of Facebook!");
				      break;
					  }
			    }
		break;
		}
		case 2:
			{
			System.out.println("\nWelcome to Instagram.");
		    System.out.println("\n1.User_Name\n2.Password\n3.Change Password");
			int insta_select=sc.nextInt();//insta selection
			String user_name="Seetha123@gmail.com";
			int pwd=87438;
			switch(insta_select)//insta selection
			{
             case 1:{
			          System.out.println("Your Instagram user name is:"+user_name);
				      break;
				    }
			 case 2:
				    {
				      System.out.println("Your Instagram Password is:"+pwd);
			          break;
					}
			 case 3:
				    { 
				      int sys_otp=(int)(Math.random()*9999+9999);
			          Thread.sleep(2000);
			          System.out.println("Your otp is:"+sys_otp);
					  Thread.sleep(2000);
					  System.out.println("Enter the otp:");
			          int otp=sc.nextInt();
					  if(sys_otp==otp)
					  {
					  System.out.println("Processing...");
					  Thread.sleep(2000);
					  System.out.println("Your entered otp is correct.");
					  System.out.println("\nEnter new password");
					  pwd=sc.nextInt();
					  System.out.println("Your New Password is:"+pwd);
					  System.out.println("Your Password is changed sucessfully.");
					  }
					  else 
					  {
					  System.out.println("Your entered otp is incorrect.");	
					  }
				      break;
			        }
			 default:
				    {
				      System.out.println("Invalid Selection of Instagram Feature!");
				      break;
				    }
			  }
		   }
		   default:
	             {
			        System.out.println("Invalid Selection of Application!");
			        break;
			     }
        }
    }
}
/*
Select the Application:

1.Facebook
2.Instagram
1
Welcome to Facebook.

1.Email
2.Password
3.Change Password
3
Your otp is:19195
Enter the otp:
19195
Your entered otp is correct.

Enter new password
97282
Your New Password is:97282
Processing...
Your Password is changed sucessfully
*/