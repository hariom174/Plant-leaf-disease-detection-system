/* You are given an integer N. Find the largest integer between 1 and 10 (inclusive) which divides N. */

import java.util.Scanner;

class Largest implements Runnable
{
	int n;
	public Largest(int n)
	{
		this.n=n;
	}
	
	@Override
	public void run()
	{
		divides();
	}
	
	public void divides()
	{
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			if(n%i==0)
			{
				sum=i;
			}
		}
		System.out.println("The largest integer:"+sum);
	}
}
public class Highest_Divisor
{
	public static void main(String...args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the largest number:");
		int n=in.nextInt();
		
		Runnable number=new Largest(n);
		Thread numberThread=new Thread(number);
		numberThread.start();
	}
}