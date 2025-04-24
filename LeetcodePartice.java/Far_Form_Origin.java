/* Alex, Bob, and, Chef are standing on the coordinate plane. Chef is standing at the origin (coordinates 
   (0,0)) while the location of Alex and Bob are (X1,Y1)(X2 ,Y2) respectively.
   Amongst Alex and Bob, find out who is at a farther distance from Chef or determine if both are at the same
   distance from Chef. */

import java.util.Scanner;
class Coordinate
{
	public String Distancelocation(int x1,int x2,int y1,int y2)
	{
		double z1=Math.sqrt((x1*x1)+(x2*x2));
		double z2=Math.sqrt((y1*y1)+(y2*y2));
		
		if(z1==z2)
		{
			return "Equal";
		}
		else if(z1>=z2)
		{
			return "Alex";
		}
		else 
		{
			return "Bob";
		}
	}
}
class Location extends Coordinate
{
	@Override
	public String Distancelocation(int x1,int x2,int y1,int y2)
	{
		return super.Distancelocation(x1,x2,y1,y2);
	}
}
class Far_Form_Origin
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first coordinate number:");
		int x1=in.nextInt();
		System.out.println("Enter the second coordinate number:");
		int x2=in.nextInt();
		System.out.println("Enter the third coordinate number:");
		int y1=in.nextInt();
		System.out.println("Enter the fourth coordinate number:");
		int y2=in.nextInt();
		
		Location l=new Location();
		String st1=l.Coordinate(x1,x2,y1,y2);
		System.out.println(st1);
	}
}

