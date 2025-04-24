/* Six friends go on a trip and are looking for accommodation. After looking for hours, they find a 
   hotel which offers two types of rooms — double rooms and triple rooms. A double room costs Rs. X, 
   while a triple room costs Rs.Y. */
   
import java.util.Scanner;
//This is a parent class
class weeks
{
	protected weeks()
	{
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int p[]=new int[4];
        int c=0;
		for(int i=0;i<4;i++)
		{
			p[i]=in.nextInt();
			if(p[i]>=10)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}
//class inherits from Weeks and invokes its constructor using super().
//child class
class Problem extends weeks
{
	public Problem()
	{
	     super();
	}
}
 class Array_Weeks
{
	public static void main(String[]args)
	{
		Problem p1=new Problem();
	}
}
