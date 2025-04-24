/*  A single car can accommodate at most 4 people.N friends want to go to a restaurant for a party. Find the
    minimum number of cars required to accommodate all the friends. */
	
import java.util.Scanner;
class CarsTrip
{
	public int FriendsParty(int n)
	{
		if(n<=4)
		{
			return 1;
		}
		else if(n>4)
		{
			 if(n%4==0)
			{
				return n/4;
			}
			else 
			{
				return n/4+1;
			}
		}	
		return 0;
	}
}
class Party extends CarsTrip
{
	@Override
	public int FriendsParty(int n)
	{
		return super.FriendsParty(n);
	}
}
class Cars_required
{
	public static void main(String...args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		Party p=new Party();
		int res=p.FriendsParty(n);
		System.out.println(res);
	}
}

