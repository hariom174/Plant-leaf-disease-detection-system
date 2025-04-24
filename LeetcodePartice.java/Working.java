/* Chef has been working hard to compete in MasterChef. He is ranked X out of all contestants. However, 
   only 10 10 contestants would be selected for the finals.

   Check whether Chef made it to the top 10 or not?
   
   */
   
import java.util.Scanner;
public class Working
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=in.nextInt();
			
			if(x >= 10)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		
	}
}