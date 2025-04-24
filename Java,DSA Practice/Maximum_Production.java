/*  Chefland has 7 days in a week. Chef is very conscious about his work done during the week.There are two ways
    he can spend his energy during the week. The first way is to do x units of work every day and the second 
	way is to do y (>x) units of work for the first d (<7) days and to do z (<x) units of work thereafter since
	he will get tired of working more in the initial few days.
    Find the maximum amount of work he can do during the week if he is free to choose either of the two 
	strategies. */

import java.util.ArrayList;
import java.util.Scanner;

public class Maximum_Production 
{

    private static ArrayList<Integer> calculateMaxWork(int d, int x, int y, int z) 
	{
        ArrayList<Integer> result = new ArrayList<>();

        // Strategy 1: Chef does x units of work every day
        if (d == 0)
		{
            result.add(0);
        } 
		else 
		{
             if((7*x)>=(d*y)+((7-d)*z))
			{
                result.add(7 * x);
            } 
			else 
			{
                result.add((d*y)+(7-d)*z);
            }
        }
        return result;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int d = scanner.nextInt();

        System.out.print("Enter the value of y (greater than x): ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of z (less than x): ");
        int y = scanner.nextInt();

        System.out.print("Enter the value of d (less than 7): ");
        int z = scanner.nextInt();

        ArrayList<Integer> result = calculateMaxWork(d, x, y, z);

        System.out.println("Maximum amount of work Chef can do each day: " + result);
    }
}
