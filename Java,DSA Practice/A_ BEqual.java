/* Chef has two numbers A and B.
   In one operation, Chef can choose either A or B and multiply it by 2.Determine whether he can make both A and 
   B equal after any number (possibly, zero) of moves. */

import java.util.Scanner;
import java.util.ArrayList;
class A
{
	
	public A()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the A number:");
		int a=in.nextInt();
		System.out.println("Enter the B number:");
		int b=in.nextInt();
	}
}
class B extends A
{
	public A(int a,int b)
	{
		super();
		ArrayList<Integer> res=new ArrayList<>();
		
		if(a==0)
		{
			res.add();
		}
		else
		{
			if(a<b)
			{
				while(a<b)
				{
					a*=2;
				}
			}
			else if(a>b)
			{
				while(a>b)
				{
					b*=2;
				}
			}
			res.add((a==b)?"Yes":"No");
		}
	}
}
public class A_BEqual
{
	public static void main(String[]args)
	{
		B equal=new B();
	}
}
