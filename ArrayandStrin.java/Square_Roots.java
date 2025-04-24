/* In olden days finding square roots seemed to be difficult but nowadays it can be easily done using in-built 
   functions available across many languages .Assume that you happen to hear the above words and you want to 
   give a try in finding the square root of any given integer using in-built functions. So here's your chance. */

import java.uitl.Scanner;
class Square
{
	public Square()
	{
		int n;
		System.out.println("Square root");
		
	}
}
class Roots extends Square
{
	public Roots(int n)
	{ 
	    super(n);
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		 n=in.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println((int)Math.sqrt(n));
		}
	}
}
class Total extends Root
{
	public Total()
	{
		super();
	}
	
}
class Square_Roots
{
	public static void main(String[]args)
	{
		Total t=new Total();
	}
}