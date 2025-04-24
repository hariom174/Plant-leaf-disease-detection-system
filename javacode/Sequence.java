/* Write a program that read two integers p and q, println p number of lines in a sequence of 1 to b in
   a lines */

import java.util.Scanner;

public class Sequence {
    public static void main(String[]args)
    {
        int p,q,j,l=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        p=in.nextInt();
        System.out.println("Enter a number of lines:");
        q=in.nextInt();
        
        /* logical */
        for(int i=1;i<=p;i++)
        {
            for(j=1;j<=q;j++)
            {
                System.out.println(+l);
                l++;
            }
            
        }
    }
}
