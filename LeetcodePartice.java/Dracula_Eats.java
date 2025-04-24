/* There are N spooky days left until Halloween.
   Dracula dines at a mysterious restaurant that changes its spooky menu daily. He particularly enjoys what 
   they serve on Tuesday.
   Today is Monday, so he wishes to calculate how many times he can indulge in his favourite menu in the next 
   N days (including today) before Halloween. */

import java.util.Scanner;
class Spooky
{
	public int n;
	public Spooky(int n)
	{
		this.n=n;
	}
}
class Halloween extends Spooky
{
	public Halloween(int n)
	{
		super(n);
		this.n=n;		
		int x=2;
		int count=0;
		
		if(n==1)
		{
			System.out.println("0");
		}
		else
		{
			while(x<=n)
			{
				count=count+1;
				x=x+7;
			}
			System.out.println(count);
		}
	}
}
class Dracula_Eats
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("How many times he can indulge in his favourite menu in the next  N days:");
		int n=in.nextInt();
		Halloween h=new Halloween(n);
	}
}