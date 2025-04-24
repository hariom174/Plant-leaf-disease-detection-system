/* Alice has recently learned in her economics class that the market is said to be in equilibrium when the 
   supply is equal to the demand.Alice has market data for N time points in the form of two integer arrays 
   S and D. Here, Si denotes the supply at the ith point of time and Di denotes the demand at the ith point of 
   time, for each 1≤i≤N.
   Help Alice in finding out the number of time points at which the market was in equilibrium. */

import java.util.Scanner;
import java.util.ArrayList;

class Economics_Class 
{
    private int n;
    private ArrayList<Integer> a;
    private ArrayList<Integer> b;

    public Economics_Class(int n) 
	{
        this.n = n;
        this.a = new ArrayList<>();
        this.b = new ArrayList<>();
    }

    public void inputElements(Scanner in, ArrayList<Integer> list, String prompt) 
	{
        System.out.println("Enter elements for " + prompt + ":");
        for (int i = 0; i < n; i++) 
		{
            list.add(in.nextInt());
        }
    }

    public int Economics1() 
	{
        int count = 0;

        inputElements(new Scanner(System.in), a, "array a");
        inputElements(new Scanner(System.in), b, "array b");

        for (int i : a) 
		{
            for (int j : b) 
			{
                if (i == j) 
				{
                    count++;
                    break; // Break to avoid counting duplicates
                }
            }
        }

        return count;
    }

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = in.nextInt();

        ArrayList<Economics_Class> economicsList = new ArrayList<>();

        for (int i = 0; i < n; i++) 
		{
            economicsList.add(new Economics_Class(n));
        }

        for (Economics_Class e : economicsList) 
		{
            int count = e.Economics1();
            System.out.println("Alice has recently learned in her economics: " + count);
        }
    }
}
