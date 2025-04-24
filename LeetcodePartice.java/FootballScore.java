import java.util.Scanner;
public class Football_score
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=in.nextInt();
		System.out.println("Enter the second number:");
		int y=in.nextInt();
		
		int total=7-Math.max(x,y);
		System.out.println(total);
	}
}