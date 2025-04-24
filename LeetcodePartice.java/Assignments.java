import java.util.Scanner;
public class Assignments
{
   public static void main(String[]args)
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int x=in.nextInt();//7
	   
	   int j=3*1;
	   if(x+j<=10)
	   {
			System.out.println("Yes");
	   }		   
	   else
	   {
		   System.out.println("No");
	   }
   }
}