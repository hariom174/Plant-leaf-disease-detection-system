import java.util.Scanner;
public class pattern1 
{
   protected int n;
   protected pattern1(int n)
   {
       this.n=n;
	   
   }
   protected void display()
   {
	  
      int i,j;
	  for(i=1;i<=n;i++)
	  {
	       for(j=1;j<=i;j++)
		   {
		      System.out.print(" * ");
		   }
		      System.out.println();
	  }
	  for(i=1;i<=n;i++)
	  {
	     for(j=4;j>=i;j--)
		 {
		   System.out.print(" * ");
		 }
		 System.out.println();
	  }
   }
   public static void main(String[]args)
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int n=in.nextInt();
	   
	   pattern1 obj=new pattern1(n);
	   obj.display();
   }
}