import java.util.Scanner;
public class Semester
{
   public static void main(String[]args)
   {
      Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int x=in.nextInt();
	  System.out.println("Enter the number:");
	  int y=in.nextInt();
	  
	  System.out.println((y<=x)? 0:y-x);
   }
}