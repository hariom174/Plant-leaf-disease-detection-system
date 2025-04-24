/* Write a program that finds all integer numbers that divide by 7 and have a remainder of 2 or 3 25
   between two given integer: */

import java.util.Scanner;

public class Division7 {
    public static void main(String[]args)
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first integer:");
        x=in.nextInt();
        System.out.println("Enter the Second integer:");
        y=in.nextInt();

        for(int i=x;i<=y;i++)
        {
            if((i%7)==2 || (i%7)==3)
            {
        
                System.out.println("The all integer number that division by 7 :"+i);
            }
        }
    }
}
