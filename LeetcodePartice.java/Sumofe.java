/* Write a program to display the sum of n term of even natural number. */

import java.util.Scanner;
public class Sum_Even
{
      private int p;
	  private Sum_Even(int p)
	  {
	     this.p=p;
	  }
	  private void display()
	  {
	      int sum=0;
		  for(int i=1;i<=p;i++)
		  {
		     
			 if(i%2==0)
			 {
			    sum=sum+i;
				System.out.println("Sum of even number:"+sum);
			 }
		  }
	  }
	  public static void main(String[]args)
	  {
	     Scanner in=new Scanner(System.in);
		 System.out.println("Enter the sum of odd:");
		 int p=in.nextInt();
		 
		 Sum_Even obj=new Sum_Even(p);
		 obj.display();
		 
	  }
}