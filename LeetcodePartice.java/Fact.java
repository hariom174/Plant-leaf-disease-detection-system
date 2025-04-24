/* Write a java to calculate the factorial of a given positive integer.

import java.util.Scanner;
public class Factorial
{
   private int n;
   
   private factorial(int n);
   {
     this.n=n;
   }
   void display()
   {
      int n=n;
	  int fac=0;
	  for(int i=1;i<=n;i++)
	  {
	     fac=fac*n;
		 System.out.println("Factorial number is:"+fac);
	  }
   }
   public static void main(String[]args)
   {
     Scanner in=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n=in.nextInt();
	 
	 factorial obj=new Factorial(n);
	 obj.display();
   }
}