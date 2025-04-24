/* Alice has a bucket of water initially having W litres of water in it. The maximum capacity of the
   bucket is  X liters.
   Alice turned on the tap and the water starts flowing into the bucket at a rate of Y litres/hour. 
   She left the tap running for exactly Z hours. Determine whether the bucket has been overflown,
   filled exactly, or is still left unfilled. */
  
import java.util.Scanner;
class Bucket
{
	int x;
	int y;
	int z;
	int w;
	public Bucket(int x,int y,int z,int w)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=w;
	}
	class water extends Bucket
	{
		public water()
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the first number:");
			int x=in.nextInt();
			System.out.println("Enter the second number:");
			int y=in.nextInt();
			System.out.println("Enter the thirds number:");
			int z=in.nextInt();
			System.out.println("Enter the fourth number:");
			int w=in.nextInt();
			
			if((x+z*w)>y)
			{
				System.out.println("overflown");
			}
			else if((x+z*w)==y)
			{
				System.out.println("filled");
			}
			else if((x+z*w)<y)
			{
				System.out.println("Unfilled");
			}
			else if((x+z*w)>y)
			{
				System.out.println("overflown");
			}
		}
	}
}
public Flow extends Water
{
	public Flow()
	{
		
	}
}
public class Bucket_WaterFlow
{
	public static void main(String[]args)
	{
		Bucket b=new Bucket();
		b.Water();
		b.Flow();
	}
}