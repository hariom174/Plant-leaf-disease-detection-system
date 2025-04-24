/* There is a circular track of length M consisting of M checkpoints and M bidirectional roads such that each 
   road has a length of 1 unit.
   Chef is currently at checkpoint A and wants to reach checkpoint B. 
   Find the minimum length of the road he needs to travel. */

import java.util.Scanner;
import java.util.ArrayList;

class Circular_Track 
{
    public ArrayList<Integer> calculateCircularTrack(int x, int y, int m) 
	{
        ArrayList<Integer> num = new ArrayList<>();

        if (x == 0) 
		{
            return num;
        }

        int a = Math.abs(y - x);
        int b = Math.abs(a - m);
        int min = Math.min(a, b);

        num.add(min);
        return num;
    }

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first circular:");
        int x = in.nextInt();
        System.out.println("Enter the Second circular:");
        int y = in.nextInt();
        System.out.println("Enter the third circular:");
        int m = in.nextInt();

        CircularTrack circularTrack = new CircularTrack();
        ArrayList<Integer> res = calculateCircularTrackcircular(x, y, m);

        System.out.println("There is a circular track of length: " + res.get(0));
    }
}
