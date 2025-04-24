/* Rent a cooler at the cost of X coins per month.Purchase a cooler for Y coins.Given that the summer season 
   will last for M months in Chefland, help Chef in finding whether he should rent the cooler or not. */
   
import java.util.Scanner;
public class Cooler
{
	protected int x;
	protected int y;
	protected int z;
	protected  Cooler(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	protected void display()
	{
		if((x*z)<y)
		{
			System.out.println("Coller cost");
		}
		else
		{
			System.out.println("Summer season");
		}
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=in.nextInt();
		System.out.println("Enter the second number:");
		int y=in.nextInt();
		System.out.println("Enter the third number:");
		int z=in.nextInt();
		
		Cooler c=new Cooler(x,y,z);
		c.display();
	}
}

