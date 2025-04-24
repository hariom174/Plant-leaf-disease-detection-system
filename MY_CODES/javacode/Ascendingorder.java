/* Check whether two number in a pair is in ascending order or descending order: */

import java.util.Scanner;

public class Ascendingorder{
    public static void main(String[]args)
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Check my pairs rang (for example 2 to 10)");
        System.out.println("Enter first number of the pairs:");
        x=in.nextInt();
        System.out.println("Enter second numbe of the pairs:");
        y=in.nextInt();

        if(x>y)
        {
            System.out.println("The pair is in desecending order:");
        }
        else
        {
            System.out.println("The pair is in ascending order!:");
        }

    }

}