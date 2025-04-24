/* Write a program to find a reverse number using array.*/

import java.util.Scanner;
public class Reverse
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of array elements:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter x-array of elements:");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println("Reverse number of array:"+arr[i]);
		}
	}
}