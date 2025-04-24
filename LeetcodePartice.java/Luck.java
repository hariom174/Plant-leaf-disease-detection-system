import java.util.Scanner;
public class LuckFour
{
   public static void main(String[]args)
   {
      Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  String s=in.next();
	  int c=0;
	  
	  for(int i=0;i<s.length();i++)
	  {
	     if(s.charAt(i)=='4')
		 {
		    c++;
		 }
	  }
	   System.out.println(c);
   }
}