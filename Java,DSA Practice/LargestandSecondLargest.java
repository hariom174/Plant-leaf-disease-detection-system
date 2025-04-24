/* You are given an array A of N integers.
   Find the maximum sum of two distinct integers in the array.
   Note: It is guaranteed that there exist at least two distinct integers in the array. */
   
import java.util.Scanner;
import java.util.Stack;
import java.util.Array;
import java.util.InputMismatchException;

class Largest 
{
    int n;

    public Largest(int n) 
	{
        this.n = n;
    }

    int getName() 
	{
        return n;
    }
}

class Guaranteed extends Exception 
{
    public Guaranteed(String message) 
	{
        super(message);
    }
}

interface Creating 
{
    Stack<Integer> SecondLargest() throws Guaranteed; // Corrected interface method declaration
}

public class LargestNumber extends Largest implements Creating 
{
    int arr[];
    Stack<Integer> res = new Stack<Integer>();

    public LargestNumber(int n) 
	{
        super(n);
        arr = new int[n]; // Corrected array initialization
    }

    public Stack<Integer> SecondLargest() throws Guaranteed 
	{ // Corrected method signature
        int start = Integer.MIN_VALUE; // Corrected initialization
        for (int i = 0; i < arr.length; i++) 
		{ // Corrected array length reference
            if (arr[i] > start) 
			{
                start = arr[i];
            }
        }

        int ends = Integer.MAX_VALUE; // Corrected initialization
        for (int i = 0; i < arr.length; i++) 
		{
            if (arr[i] < ends) 
			{
                ends = arr[i];
            }
        }

        int mid = ends;
        for (int i = 0; i < arr.length; i++) 
		{
            if (arr[i] > mid && arr[i] != start) 
			{
                mid = arr[i];
            }
        }
        res.add(start + mid);
        return res;
    }
public class LargestandSecondLargest
{
    public static void main(String[] args) 
	{
        Stack<Integer> result = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of array elements:");
        int n = in.nextInt();

        System.out.println("Enter array elements:");
        LargestNumber largestNumber = new LargestNumber(n);

        for (int i = 0; i < n; i++) 
		{
            largestNumber.arr[i] = in.nextInt(); // Corrected array assignment
        }

        try {
            Stack<Integer> secondLargest = largestNumber.SecondLargest();
            System.out.println("Second largest element: " + secondLargest.pop());
        } catch (Guaranteed e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

