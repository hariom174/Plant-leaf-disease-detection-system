import java.util.Scanner;
public class pattern4
{
	public int n;
	public pattern4(int n)
	{
		this.n=n;
	}
	public void dispaly()
	{
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
				for(k=1;k<=i;k++)
				{
					System.out.print(k+"");
				}
				System.out.println();
		}
		
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		
		pattern4 obj=new pattern4(n);
		obj.dispaly();
	}
}
