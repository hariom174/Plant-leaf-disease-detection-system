/* Write a program to find duplication value of an array value. */

import java.util.Scanner;
public class Duplication
{
   public static void main(String[]args)
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   
		System.out.println("Enter "+n+" integer:");
	   for(int i=0;i<arr.length;i++)
	   {
		  arr[i]=in.nextInt();
	   }
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
		       if(arr[i]==arr[j])
		       {
			       System.out.println("Duplication  value is"+arr[i]);
		       } 
		   }
	   }
   }  
}