/* Write a program to print a sum of even number.*/

import java.util.Scanner;
class EvenNumber{
  public static void main(String[]args)
  {
     Scanner in=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int n=in.nextInt();
	 System.out.println("Sum of even number:"+Sumofeven(n));
  }
  public static int Sumofeven(int i);
  {
     int sum=0;
     for(int i=2;i<=n;i+=2)
	 {
	    sum=sum+i;
	 }
		return sum;
  }
}