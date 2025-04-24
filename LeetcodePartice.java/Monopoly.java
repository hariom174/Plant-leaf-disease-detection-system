import java.util.Scanner;
public class Monopoly
{
  public static void main(String[]args)
  {
     Scanner in=new Scanner(System.in);
	 System.out.println("Enter the R1 number:");
	 int r1=in.nextInt();//2
	 System.out.println("Enter the R2 number:");
	 int r2=in.nextInt();//10
	 System.out.println("Enter the R3 number:");
	 int r3=in.nextInt();//3
	 
	 if((r1+r3)<r2 || (r1+r2)<r3 || (r2+r3)<r1)
	 {
		 System.out.println("Yes");
	 }
	 else
	 {
		 System.out.println("No");
	 }
  }
}