/*Write a program that reads 5 number and sum of all odd values between them. */

import java.util.Scanner;

public class Sumofnum{

    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("1 to 5 sum of odd number:");
        int i=in.nextInt();
        int number=in.nextInt();
        int total=0;
        /*User interface and logical */ 
        for(i=0;i<5;i++)
        {
            if(number%2!=0)
            {
                total +=number;
            }
        }
        System.out.println("Sum of odd number is:"+total);
    }
}
