/* On a sunny Sunday afternoon, Chef prepared a brunch for his 20 neighbours.Chef prepared a total of X plates.
   However, the meal was so good that the neighbours started taking Y plates each. */

import java.util.Scanner;
class Prepared implements Runnable
{
	public int x;
	public int y;
	public Prepared(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public void run()
	{
		Brunch();
	}
	public void Brunch()
	{
		if(x/y<=20)
		{
			System.out.println(x/y);
		}
		else
		{
			System.out.println("20");
		}
	}
}
class Sunday_Brunch
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first prepared number:");
		int x=in.nextInt();
		System.out.println("Enter the second prepared number:");
		int y=in.nextInt();
		
		Runnable sunny=new Prepared(x,y);
		Thread sunnyThread=new Thread(sunny);
		sunnyThread.start();
	}
}