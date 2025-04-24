/* Given a signed 32-bits integer x,return x with its digits reversed.If reversing x,causes the 
   value to go outside the signed 32-bits integer range ,then return 0. */
   
   import java.util.Scanner;
   public class Reverse{
      public static void main(String[]args)
      {
	     Scanner in=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 int n=in.nextInt();
		 System.out.println("Reverse number is:"+reversed(n));
      }	  
	  static int reversed(int n)
	  {
	      int rev=0;
		  int digit;
		  while(n!=0)
		  {
		      digit=n%10;
			  rev=(rev*10)+digit;
			  n=n/10;
		  }
		  return rev;
	  }
   }