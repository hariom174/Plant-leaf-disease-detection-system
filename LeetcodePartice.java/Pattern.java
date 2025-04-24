/* Write a program to print a print:*/

import java.util.Scanner;
public class Pattern{
   public static void main(String[]args)
   {
      Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int n=in.nextInt();
	  int i,j,p;
	  
	  p=(n/2)+1;
	  
	  for(i=1;i<=n;i++)
	  {
	    for(j=1;j<=n;j++)
		{
		  if(i==p || j==p || (i==1&&j<=p) || (i==n&&j>=p) || (j==1&&i<=p) || (j==n&&i>=p))
		     System.out.print(" * ");
		  else
            System.out.print(" ");		  
		}
		System.out.println();
	  }
   }
}