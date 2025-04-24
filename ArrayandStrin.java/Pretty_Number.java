 /* Vasya likes the number 239. Therefore, he considers a number pretty if its last digit is 2, 3 or 9.
    Vasya wants to watch the numbers between L and R (both inclusive), so he asked you to determine how 
    many pretty numbers are in this range. Can you help him? */
	
import java.util.Scanner;
class Vasya
{
	public Vasya()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int r=in.nextInt();
		System.out.println("Enter the second number:");
		int l=in.nextInt();
		int count=0;
		for(int i=r;i<=l;i++)
		{
			if(i%10==2||i%10==3||i%10==9)
			{
				count++;
			}
		}
		System.out.println("Considers a number pretty :"+count);
	}
}
class Pretty extends Vasya
{
	public Pretty()
	{
		super();
	}
}
public class Pretty_Number
{
	public static void main(String[]args)
	{
		Pretty p=new Pretty();
	}
}