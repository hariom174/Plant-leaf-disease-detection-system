/* Write a program to print a number, its square and cube, Starting with 1 and printing n lines.
   Accept the number of lines (n,integer) from the user. */

import java.util.Scanner;

public class Cube {
    public static void main(String[]args)
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of cubes:");
        n=in.nextInt();

        /* Logical  */
        for(int i=1;i<=n;i++)
        {
            
            System.out.println("Number" +i+ ",Square;" +i*i+ "Cube;"+(i*i*i));
            
        }
    }
    
}
