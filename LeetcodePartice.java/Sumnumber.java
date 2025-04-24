/* Write a program to calculate the sum of all number from 1 to n. */

import java.util.Scanner;
public class Sum
{
   private int p;
   
   private Sum(int n)
   {
      this.p=n;
   }
   private void display()
   {
      int n=p;
	  int sum=0;
	  for(int i=1;i<=n;i++)
	  {
	      sum=sum+i;
		  System.out.println("Sum of number:"+sum);
	  }
   }
   public static void main(String[]args)
   {
      Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int p=in.nextInt();
	  
	  Sum obj=new Sum(p);
	  obj.display();
   }
}