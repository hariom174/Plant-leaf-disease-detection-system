import java.util.Scanner;
public class Chocolate 
{
   public static void main(String[]args)
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int x=in.nextInt();
	   System.out.println("Enter the second number:");
	   int y=in.nextInt();
	   
	   int c=x*2;
	   int d=y*5;
	   if(c>d)
	   {
		   System.out.println("Chocolate");
	   }
	   else if(c==d)
	   {
		   System.out.println("Either");
	   }
	   else
	   {
		   System.out.println("Candy");
	   }
   }
}