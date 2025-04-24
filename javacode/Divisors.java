/* Write a program that find all the divisors of an integer. */

import java.util.Scanner;

public class Divisors {
    public static void main(String[]args)
    {
        int i,n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=in.nextInt();

        for(i=1;i<=n;i++)
        {
            if((n%i)==0)
            {
                System.out.println(+i);
            }
        }
    }
}
