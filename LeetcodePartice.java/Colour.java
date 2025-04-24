import java.util.Scanner;
public class Colour
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the choose colour:");
		int c=in.nextInt();
		int k=in.nextInt();
		int count=0;
		
		for(int i=0;i<c;i++)
		{
			int h=in.nextInt();
			if(h>k)
			{
				count++;
			}
		}
		System.out.println("Choose the colour:"+count);
	}
}