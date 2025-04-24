/* Given A,B, and C as the sides of a triangle, find whether the triangle is scalene. */

import java.util.Scanner;
class Side
{
    public Side()
	{
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the first side:");
	   int a=in.nextInt();
	   System.out.println("Enter the Second side:");
	   int b=in.nextInt();
	   System.out.println("Enter the third side:");
	   int c=in.nextInt();
	   
	   if(a!=b && b!=c && c!=a)
	   {
		   System.out.println("Yes");
	   }
	   else
	   {
		   System.out.println("No");
	   }
	}
}
class B extends Side
{
	public B()
	{
		super();
	}
}
public class Traingle
{
	public static void main(String[]args)
	{
		B b=new B();
	}
}
	