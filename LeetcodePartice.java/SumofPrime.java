/* Write a program to check whether a number can be expressed as the sum of twi prime number. */

import java.util.Scanner;
 class Sum_prime
{
   private int num;
   
   private Sum_prime(int num)
   {
	    this.num=num;
   }
   private void display()
   {
       
	   int sum=0,count=0;
	   for(int i=2;i<=num;i++)
	   {
		  
	     for(int j=2;j<=i/2;j++)
	     {
		   if(i%j==0){
			   count++;
		   	   break;
		   }
		 }
		 if(count==0 && i!=0)
		 {
			 sum=sum+i;
		
		 }
	        System.out.println("Sum of prime number:"+sum);
     }   
   }
   public static void main(String[]args)
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int num=in.nextInt();
	   
	   Sum_prime obj=new Sum_prime(num);
	   
	   obj.display();
   }
}
