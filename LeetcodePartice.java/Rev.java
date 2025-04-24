import java.util.Scanner;
  public class reverse{
     public static void main(String[]args)
	 {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		int rev=0;
		int dig=n%10;
		 rev=(rev*10+dig);
		 n=n/10;
		
		System.out.println("Reverse number is:"+rev);
		
	 }
  
  }