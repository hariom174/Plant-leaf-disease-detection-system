/* A bulb company claims that the average lifetime of its bulbs is at least X units. The company ran a test on 
   N bulbs. You are given the lifetime of N−1 of these bulbs. What is the minimum non-negative integer value of 
   lifetime the remaining bulb can have, such that the claim of the company holds true? */

import java.util.Scanner;
import java.util.ArrayList;

class Bulbs 
{
    int n;

    public Bulbs(int n) 
	{
        this.n = n;
    }

    int getBulbs() 
	{
        return n;
    }
}

interface Lifetime 
{
    ArrayList<Integer> res = new ArrayList<>();

    void x();
}

class Average extends Bulbs implements Lifetime 
{
    int x;

    public Average(int n, int x) 
	{
        super(n);
        this.x = x;
    }

    @Override
    public void x() 
	{
        int y = n * x;
        for (int i = 0; i < n - 1; i++) 
		{
            y -= x;
        }
        res.add((y < 0) ? 0 : y);
    }
}

public class Good_Bulbs 
{
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n number of bulb:");
        int n = in.nextInt();
        System.out.println("Enter the x number of bulb:");
        int x = in.nextInt();

        Average avg = new Average(n, x);
        avg.x();

        // Now you can access the ArrayList res from the Lifetime interface
        ArrayList<Integer> result = Lifetime.res;

        // Print the result or perform other operations as needed
        System.out.println("Result: " + result);
    }
}
