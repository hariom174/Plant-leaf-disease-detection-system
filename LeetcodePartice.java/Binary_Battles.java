/* In one round, each team will be paired up with and compete against one of the other teams. If there are X 
   teams before the start of a round, 2/X  matches are held simultaneously during the round between 2/X pairs of
   teams. The winning team of each match will move on to the next round, while the losing team of each match 
   will be eliminated. There are no ties involved. The next round will then take place in the same format 
   between the remaining teams. The process will continue until only one team remains, which will be declared 
   the overall winner.The organizers want to find the total time the event will take to complete. It is given 
   that each round spans A minutes, and that there is a break of B minutes between every two rounds (no break after the last round).*/

import java.util.Scanner;
class Paired
{
	public int PairedOfTeam(int x,int y,int z)
	{
		int sum=0;
		int power=0;
		int n=x/2;
		
		while(x!=1)
		{
			x=x/2;
			power++;
		}
		for(int i=0;i<power-1;i++)
		{
			sum=sum+y+z;
		}
		sum=sum+y;
		return sum;
	}
}
class Match extends Paired
{
	@Override
	public int PairedOfTeam(int x,int y,int z)
	{
		return super.PairedOfTeam(x,y,z);
	}
}
class Binary_Battles
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the round first number:");
		int x=in.nextInt();//16
		System.out.println("Enter the round second number:");
		int y=in.nextInt();//30
		System.out.println("Enter the round third number:");
		int z=in.nextInt();//5
		
		Match m=new Match();
		int result = m.PairedOfTeam(x,y,z);
		System.out.println("The process will continue until only one team remains:"+result);
	}
}

