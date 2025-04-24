/* Chef visited a grocery store for fresh supplies. There are N items in the store where the ithitem has a 
   freshness value Ai and cost Bi.
   Chef has decided to purchase all the items having a freshness value greater than equal to X. Find the total 
   cost of the groceries Chef buys. */

import java.util.Scanner;
import java.util.ArrayList;
class Visited 
{
	int n;
	int x;
	public Visited(int n,int x)
	{
		this.n=n;
		this.x=x;
	}
}
class Purchase extends Visited
{
	public Purchase(int n,int x)
	{
		super(n,x);
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the colume of array elements:");
		n=in.nextInt();
		System.out.println("Enter the row of array elements:");
		x=in.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int total=0;
		
		System.out.println("Enter the X-array of elements:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}

		for(int j=0;j<n;j++)
		{
			arr2[j]=in.nextInt();
		}
		for(int k=0;k<n;k++)
		{
			if(arr2[k]>=x)
			{
				total+=arr2[k];
			}
		}
		System.out.println("Total number of cost of groceries:"+total);
	}
}
public class Cost_Groceries
{
	public static void main(String[]args)
	{
		Purchase p=new Purchase(0,0);
	}
}
