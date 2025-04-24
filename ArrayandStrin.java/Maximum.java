/* Write a program to print maximum and minimum value of an array. */

import java.util.Scanner;
public class MaximumArrray 
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of array elements:");
		int n=in.nextInt();
		int[] arr=new int[n];
        int i;
		System.out.println("Enter x-array of elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(i=0;i<n;i++)
        {
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
        }
		  System.out.println("Maximum elements of array:"+max);
		  System.out.println("Minimum elements of array:"+min);
    
	}
}

