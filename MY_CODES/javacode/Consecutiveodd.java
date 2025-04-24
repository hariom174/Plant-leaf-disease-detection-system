/*/ Write a program to compute the sum of consecutive odd numbers from a given pair of integer|: */

import java.util.Scanner;

public class Consecutiveodd {
    public static void main(String[]args)
    {
        int x,y,total=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a pair of number (for example 10,2)");
        System.out.println("Enter the first number of pair is:");
        x=in.nextInt();
        System.out.println("Enter the second number of pair is:");
        y=in.nextInt();

        /* Logical user  */
        if(x<y)
        {
            System.out.println("Sum of consecutive:");
        }    
            System.out.println("List of odd number:");
            for(int i=y;i<=x;i++)
            {
                if ((i%2)!=0)
                {
                    System.out.println(i);
                    total +=i;
                }    
            }
        System.out.println("The sum of consective odd number from a given pair of input:"+total);
    }
}
