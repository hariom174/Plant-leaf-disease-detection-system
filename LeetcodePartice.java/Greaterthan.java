/*  Write a java program to find the greatest common divisor (GCD) of two number.*/

import java.util.Scanner;
public class Greatest
{
   private int Divisor(int n1,int n2)
{
   // Case1:if the second number is 0, the greater is the first number
  
   if(n2==0)
   {
     return n1;
   }
    //Case2: calculate the greater by recursively calling with num2 as the new num1 and the remainder as num2

    int remainder=n1%n2;
    return Divisor(n2,remainder);
   
 }
    public static void main(String[]args)
    {
       Greatest A=new Greatest();
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the first number:");
       int n1=in.nextInt();
       System.out.println("Enter the second number:");
       int n2=in.nextInt();
       System.out.println("N1 is divided than N2 is:"+A.Divisor(n1,n2));
    }
}