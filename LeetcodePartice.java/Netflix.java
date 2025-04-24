 /* Alice, Bob, and Charlie are contributing to buy a Netflix subscription. However, Netfix allows only two 
  users to share a subscription.
  Given that Alice, Bob, and Charlie have A,B,and C rupees respectively and a Netflix subscription 
  costs X rupees,find whether any two of them can contribute to buy a subscription. */

import java.util.Scanner;
class Alice
{
	public Alice()
	{
	}
}
class Bob extends Alice
{
	@override
	public Bob()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Alice contributing:");
		int a=in.nextInt();
		System.out.println("Enter the Bob contributing:");
		int b=in.nextInt();
		System.out.println("Enter the Charlie contributing:");
		int c=in.nextInt();
		System.out.println("Enter the Netflix costs:");
		int x=in.nextInt();
		
		if((x+b)>=x || (b+c)>=c || (a+c)>=c)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}
class Charlie extends Alice
{
	@override
	public Charlie()
	{
		super();
	}
}
class Netflix
{
	public static void main(String[]args)
	{
		Alice a1=new Charlie();
	}
}


