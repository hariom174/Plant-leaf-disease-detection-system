 /* Chef is fond of burgers and decided to make as many burgers as possible.Chef has A patties and B buns.
 To make 1 1 burger, Chef needs 1 1 patty and 1 1 bun.Find the maximum number of burgers that Chef 
 can make. */
 
import java.util.Scanner;
public class burgers
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the x number:");
		int x=in.nextInt();
		System.out.println("Enter the y number:");
		int y=in.nextInt();
		
		if(x<y)
		{
			System.out.println(x);
		}
		else
		{
			System.out.println(y);
		}
		
	}
}