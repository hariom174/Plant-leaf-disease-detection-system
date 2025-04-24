/* Write a program to calculate the sum of all numbers not division by 17 between two given integer 
   number  */

import java.util.Scanner;

public class Calculate {
    public static void main(String[]args)
    {
        int x,y,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sum of all number:");
        x=in.nextInt();
        y=in.nextInt();

        for(int i=x;i<=y;i++)
        {
            if((i%17)!=0)
            {
                sum+=i;
            }
        }
           System.out.println("The sum of all number not division of 17 between two integer :"+sum);
    }
}
