/* Write a java to calculate the factorial of a given positive integer. */

import java.util.Scanner;
public class Factorial
{
   private int n;
   
   private Factorial(int n)
   {
     this.n=n;
   }
   void display()
   {
      
	  int fac=1;
	  for(int i=1;i<=n;i++)
	  {
	     fac=fac*i;
		 System.out.println("Factorial number is:"+fac);
	  }
   }
   public static void main(String[]args)
   {
     Scanner in=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n=in.nextInt();
	 
	 Factorial obj=new Factorial(n);
	 obj.display();
   }
}