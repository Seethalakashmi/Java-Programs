//select the trainer along with subject
import java.util.Scanner;
class SkillSelection9 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Select the subject: \n1.JAVA \n2.SQL \n3.PYTHON \n4.WEB-TECH \n5.EXIT\n");
		int input=sc.nextInt();
		switch(input)
		{
			case 1:
				{
				System.out.print("Select Java Trainer: ");
				System.out.print("\n1.Laxmi\n2.Gayathri \n3.Mathavan\n ");
				int java=sc.nextInt();
				switch(java)
					{
					case 1:{System.out.print("Your java trainer name is Laxmi. ");
					       break;}
					case 2:{System.out.print("Your java trainer name is Gayathri. ");
					       break;}
				    case 3:{System.out.print("Your java trainer name is Mathavan. ");
					       break;}
				    default:{System.out.println("Invalid Selection.");
						   break;}
					}
				break;
				}
			case 2:
				{
				System.out.print("Select SQL Trainer: ");
				System.out.print("\n1.Vimal\n2.Karnan \n3.Mithran \n");
				int sql=sc.nextInt();
				switch(sql)
					{
					case 1:{System.out.print("Your sql trainer name is Vimal. ");
					       break;}
					case 2:{System.out.print("Your sql trainer name is Karnan. ");
					       break;}
				    case 3:{System.out.print("Your sql trainer name is Mithran. ");
					       break;}
				    default:{System.out.println("Invalid Selection.");
						   break;}
					}
				break;
				}
			case 3:
				{
				System.out.print("Select Python Trainer: ");
				System.out.print("\n1.Yazhini\n2.Mahima \n3.Surya\n ");
				int python=sc.nextInt();
				switch(python)
					{
					case 1:{System.out.print("Your python trainer name is Yazhini. ");
					       break;}
					case 2:{System.out.print("Your python trainer name is Mahima. ");
					       break;}
				    case 3:{System.out.print("Your python trainer name is Surya. ");
					       break;}
				    default:{System.out.println("Invalid Selection.");
						   break;}
					}
				break;
				}
			case 4:
				{
				System.out.print("Select WEB-TECH Trainer: ");
				System.out.print("\n1.Vikram\n2.Sethupathi \n3.Vinayak\n ");
				int web=sc.nextInt();
				switch(web)
					{
					case 1:{System.out.print("Your Web_Tech trainer name is Vikram. ");
					       break;}
					case 2:{System.out.print("Your Web_Tech trainer name is Sethupathi. ");
					       break;}
				    case 3:{System.out.print("Your Web_Tech trainer name is Vinayak. ");
					       break;}
				    default:{System.out.println("Invalid Selection.");
						   break;}
					}
				break;
				}
			default:
				{
				break;
				}
		}
	}
}
/*
Select the subject:
1.JAVA
2.SQL
3.PYTHON
4.WEB-TECH
5.EXIT
4
Select WEB-TECH Trainer:
1.Vikram
2.Sethupathi
3.Vinayak
 2
Your Web_Tech trainer name is Sethupathi.
*/