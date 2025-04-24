import java.util.Scanner;
public class pattern5
{
    public int n;
	public pattern5(int n)
	{
	   this.n=n;
	}
	public void display()
	{
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		
		pattern5 obj=new pattern5(n);
		obj.display();
	}
}