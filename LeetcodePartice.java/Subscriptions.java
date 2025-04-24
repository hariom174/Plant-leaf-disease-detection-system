/* A new TV streaming service was recently started in Chefland called the Chef-TV.A group of N friends in 
   Chefland want to buy Chef-TV subscriptions. We know that 6 people can share one Chef-TV subscription. 
   Also, the cost of one Chef-TV subscription is X rupees. Determine the minimum total cost that the group of 
   N friends will incur so that everyone in the group is able to use Chef-TV. */

import java.util.Scanner;
class TV
{
	public TV()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number x-rupees:");
		int x=in.nextInt();//12
		System.out.println("Enter the N friends:");
		int n=in.nextInt();//250
		
		if(x>6)
		{
			if(x%6!=0)
			{
				int ans=x/6;
				System.out.println((ans+1)*n);
			}
			else
			{
				int ans=x/6;
				System.out.println(ans*n);
			}
		}
		else
		{
			System.out.println(n);
		}
	}
}
class Service extends TV
{
	public Service()
	{
		super();
	}
}
class Subscriptions
{
	public static void main(String[]args)
	{
		Service s=new Service();
		
	}
}

