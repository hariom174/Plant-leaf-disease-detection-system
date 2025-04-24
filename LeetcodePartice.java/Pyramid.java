/* Write a program to make a pyramid pattern with number increased by 1. */

import java.util.Scanner;
public class pattern{
      protected int p;
	  
	  protected pattern(int n)
	  {
	      this.p=n;
	  }
	  protected void display()
	  {
		  int n=p;
	      int i,j;
		  for(i=1;i<=p;i++)
		  {
		     for(j=p;j>=i;j--)
			 {
		
			 System.out.print(" * ");
		  }
		     System.out.println();
		  }  
	  }
	  public static void main(String[]args)
	  {
	      Scanner in=new Scanner(System.in);
		  System.out.println("Enter the number:");
		  int p=in.nextInt();
		  
		  pattern obj=new pattern(p);
		  
		  obj.display();
	  }
}