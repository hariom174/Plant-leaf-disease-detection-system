/* In the medieval age, there were 3 kingdoms A, B, and C. The army of these kingdom had 
   NA,NB, and NC soldiers respectively.You are given that an army with X soldiers can defeat an army with 
   Y soldiers only if X>Y. */
 
 
import java.util.Scanner;
public class Dominant_Army
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the NA number:");
		int x=in.nextInt();//15
		System.out.println("Enter the NB number:");
		int y=in.nextInt();//5
		System.out.println("Enter the NC number:");
		int z=in.nextInt();//3
		
		if(x>(y+z) || y>(x+z) || z>(x+y))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}