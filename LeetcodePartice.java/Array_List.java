/* Chef is a beginner and should ideally try and solve only problems with difficulty rating strictly 
   less than 1000. Given a list of difficulty ratings for problems in the Chef’s to-do list, please help 
   him identify how many of those problems Chef should remove from his to-do list, so that he is only left
   with problems of difficulty rating less than 1000. */
 
import java.util.Scanner;
class Problem
{
	protected Problem()
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=in.nextInt();
	int[] d=new int[n];
	int c=0;
	
	for(int i=0;i<n;i++)
	{
		d[i]=in.nextInt();
		if(d[i]>=1000)
		{
			c++;
		}
	}
	System.out.println(c);
    }
}
class difficulty extends Problem
{
	public difficulty()
	{
		super();
	}
}
public class Array_List
{
	public static void main(String[]args)
	{
		
		difficulty d1=new difficulty();
	}
	
}