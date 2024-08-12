//print alphabet lower case & upper case from a to z;lower case & upper case from z to a.
class Alphabet15 
{
	public static void main(String[] args) 
	{
		for(char ch='a';ch<='z';ch++)//lower case a to z
		{
			System.out.print(ch+" ");
		}
		    System.out.println();
		for(char ch='A';ch<='Z';ch++)//upper case A to Z
		{
			System.out.print(ch+" ");
		}
		    System.out.println();
		for(char ch='z';ch>='a';ch--)//lower case z to a
		{
			System.out.print(ch+" ");
		}
		    System.out.println();
		for(char ch='Z';ch>='A';ch--)//lower case Z to A
		{
			System.out.print(ch+" ");
		}
		    System.out.println();
	}
}
/*
a b c d e f g h i j k l m n o p q r s t u v w x y z  
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
z y x w v u t s r q p o n m l k j i h g f e d c b a 
Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
*/