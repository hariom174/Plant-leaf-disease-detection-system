/* Chef is a very lazy person. Whatever work is supposed to be finished in x units of time, he finishes it in 
   m*x units of time. But there is always a limit to laziness, so he delays the work by at max d units of time. 
   Given x,m,d, find the maximum time taken by Chef to complete the work. */
   
import java.util.Scanner;

public class Lazy_Chef
{
	public static int findMin(int x,int m,int y)
	{
		if(x==0)
		{
			return x+y;
		}
		int z=x*m;
		int a=x+y;
		int min=Math.min(z,a);
		return min;
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=in.nextInt();//1
		System.out.println("Enter the second number:");
		int m=in.nextInt();//3
		System.out.println("Enter the third number:");
		int y=in.nextInt();//1
		
		int result = findMin(x, m, y);
        System.out.println(result);
	}
}