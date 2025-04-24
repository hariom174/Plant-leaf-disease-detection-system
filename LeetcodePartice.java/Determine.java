 /* There is a problem worth 
�
X points. Chef finds out that the problem has exactly 
10
10 test cases. It is known that each test case is worth the same number of points.

Chef passes 
�
N test cases among them. Determine the score Chef will get.

NOTE: See sample explanation for more clarity.
 */
 
import java.util.Scanner;
public class Determine 
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the x number:");
		int x=in.nextInt();
		System.out.println("Enter the n number:");
		int n=in.nextInt();
		
		int tot=((x*10)/n);
		System.out.println(tot);
	}
}
