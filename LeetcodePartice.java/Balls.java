/* You have N balls and K boxes. You want to divide the N balls into K boxes such that:

 Each box contains ≥1 balls.
 No two boxes contain the same number of balls.
 Determine if it is possible to do so. */
 
import java.util.Scanner;
class Ball
{
	protected int n;
	protected int k;
	
	protected Ball(int n,int k)
	{
		this.n=n;
		this.k=k;
	}
	protected void dispaly()
	{
		if(n>=k)
		{
			for(int j=1;j<k+1;j++)
			{
				n=n-j;
			}
			if(n>=0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
		else
		{
			System.out.println("No");
		}
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		System.out.println("Enter the k number:");
		int k=in.nextInt();
		
		Ball b1=new Ball(n,k);
		b1.dispaly();
	}
}