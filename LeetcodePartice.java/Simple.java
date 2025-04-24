/* Write a java program to calculate simple interest.*/

import java.util.Scanner;
   public class Simple
   {
      public static void main(String[]args)
	  {
	     Scanner in=new Scanner(System.in);
		 System.out.println("Enter the principle:");
		 float p=in.nextFloat();
		 System.out.println("Enter the rate:");
		 float r=in.nextFloat();
		 System.out.println("Enter the time:");
		 float t=in.nextFloat();
		 
		 System.out.println("Total Simple interest is:"+Interest(p,r,t));
	  }
	    private static float Interest(float p,float r,float t)
		{
		   return (p*r*t)/100;
		}
}