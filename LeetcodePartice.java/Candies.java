/* There are N children and Chef wants to give them 1 candy each. Chef already has X candies with him.
   To buy the rest, he visits a candy shop. In the shop, packets containing exactly 4 candies are available.
   Determine the minimum number of candy packets Chef must buy so that he is able to give 1 candy to each of the 
   N children. */

import java.util.Scanner;
class Childern
{
	public Childern()
	{
		int x;
        int y;
	}
}
class Canday extends Childern
{
	public Canday()
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=in.nextInt();//20,10;
		System.out.println("Enter the second number:");
		int y=in.nextInt();//12,100;
		
		if(x>=y)
		{
			if((x-y)%4==0)
			{
				System.out.println((x-y)/4);
			}
			else
			{
				System.out.println((x-y)/4+1);
			}
		}
		else
		{
			System.out.println("0");
		}
	}
}
class Shop extends Canday
{
	public Shop()
	{
		
	}
}
class Candies
{
	public static void main(String[]args)
	{
		Shop s=new Shop();
	}
}


