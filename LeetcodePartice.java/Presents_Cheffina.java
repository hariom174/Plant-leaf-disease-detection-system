/* Chef has fallen in love with Cheffina, and wants to buy N gifts for her. On reaching the gift shop, Chef got 
   to know the following two things:
   The cost of each gift is 1 coin.On the purchase of every 4thgift, Chef gets the 5th gift free of cost. */

import java.util.Scanner;

public class Presents_Cheffina 
{
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        try 
		{
            System.out.println("Enter the number:");
            int n = in.nextInt();//5
            int a = n / 5;
            int b = n - a;

            if (n % 5 == 0) 
			{
                System.out.println(n);
            } else 
			{
                System.out.println(b);
            }
        } 
		catch (ArithmeticException e) 
		{
            System.out.println("ArithmeticException");
        }
    }
}
