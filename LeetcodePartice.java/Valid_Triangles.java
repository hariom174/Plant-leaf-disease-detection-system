/* The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains
   three angles A, B and C, of the triangle separated by space. */

import java.util.Scanner;
import java.util.InputMismatchException;
class Valid_Triangles
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		try
		{
			System.out.println("Enter the first triangle number:");
			int a=in.nextInt();
			System.out.println("Enter the second triangle number:");
			int b=in.nextInt();
			System.out.println("Enter the third triangle number:");
			int c=in.nextInt();
			
			int sum=a+b+c;
			if(sum==180)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
			catch (InputMismatchException e)
			{
				System.out.println("Number is not match:");
			}
		
	}
}


