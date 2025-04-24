/* Chef has an ore with melting point of X degrees.Chef’s kiln has a initial temperature of Y degrees. The 
   temperature of the kiln increases by i degrees after the ith minute.
   Find the minimum time in minutes after which the ore starts melting. */
 
import java.util.Scanner;
import java.util.ArrayList;
class Melt_Gold
{
	public static ArrayList<Integer> Temperature(int x,int y)
	{
		ArrayList<Integer> res=new ArrayList<>();
		if(x==0)
		{
			res.add(0);
		}
		else
		{
			for(int i=1;i<=x;i++)
			{
				y=y+i;
				if(y>=x)
				{
					res.add(1);
					break;
				}
			}
		}
		return res;
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=in.nextInt();
		System.out.println("Enter the second number:");
		int y=in.nextInt();
		
		Melt_Gold a=new Melt_Gold();
		ArrayList<Integer> res=a.Temperature(x,y);
		System.out.println("The minimum time in minutes after which the ore starts melting"+res);
		
	}
}