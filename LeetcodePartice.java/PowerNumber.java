/* Write a java recursive method to calculate the exponentiation of a number (base) raised to power(exponent). */


import java.util.Scanner;
public class Calculate
{
   public static double power(double n ,int exponent)
   {
      // case : any number raised to the power of 0 is 1

      if(n==0)
      {
        return 1;
      }
       // Recursive case: multiply the base with the exponentitation of (base, exponent-1)
       
      return n*power(n,exponent-1);
   }
   public static void main(String[]args)
   {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        double n=in.nextDouble();
        System.out.println("Enter teh exponent:");
        int exponent=in.nextInt();
        double result = (n,exponent);
        System.out.println(n+"Raised to the power of: "+exponent+ " is "+result);
   }
}