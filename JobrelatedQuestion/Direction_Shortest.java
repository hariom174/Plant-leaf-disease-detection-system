/* Given a route containing 4 direction (E,W,N,S) , find the shortest path to reach destination .
    ''WNEENESENNN" */

import java.util.Scanner;
public class Direction_Shortest
{
	public static float getShortestPath(String path)
	{
		int x=0,y=0;
		
		for(int i=0;i<path.length();i++)
		{
			char dir=path.charAt(i);
			
			//south
			if(dir=='S')
			{
				y--;
			}
			//North
			else if(dir=='N')
			{
				y++;
			}
			//West
			else if(dir=='W')
			{
				x--;
			}
			//East
			else
			{
				x++;
			}
		}
		int x2=x*x;
		int y2=y*y;
		
		return (float)Math.sqrt(x2+y2);

	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first char:");
		String path=in.nextLine();
		
		System.out.println(getShortestPath(path));
	}
}