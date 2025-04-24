/*After the phenomenal success of the 36th Chamber of Shaolin, San Te has decided to start 37th Chamber of 
  Shaolin. The aim this time is to equip women with shaolin self-defence techniques.The only condition for 
  a woman to be eligible for the special training is that she must be between 10 and 60 years of age, inclusive
  of both 10 and 60.Given the ages of N women in his village, please help San Te find out how many of them are 
  eligible for the special training. */

import java.util.Scanner;
public class Self_Defence
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of the elements:");
		int n=in.nextInt();
		int arr[]=new int[n];
		int count=0;
		
		System.out.println("Enter x-array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=10 && arr[i]<=60)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

