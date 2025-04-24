/* Chef and Chefina are residing in a hotel.There are 10 floors in the hotel and each floor consists of 10 rooms.
   Floor 1 consists of room numbers 1 to 10.Floor 2 consists of room numbers 11 to 20.Floor i consists of room 
   numbers 10⋅(i−1)+1 to 10⋅i.You know that Chef's room number is X while Chefina's Room number is Y.
  If Chef starts from his room, find the number of floors he needs to travel to reach Chefina's room. */

import java.util.Scanner;
import java.util.InputMismatchException; // Import this exception
public class Many_Floors
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the number:");
			int x=in.nextInt();//1
			System.out.println("Enter the second number:");
			int y=in.nextInt();//100
			
			int a=(((x-1)/10)+1);
			int b=(((y-1)/10)+1);
			
			System.out.println("TOtal floors in my hostel :"+Math.abs(a-b));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Total floor of this building:");
		}
	}
}