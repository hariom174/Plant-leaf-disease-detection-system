/* Chef decides to go to the water park to play. To enter the water slide, a person must have a weight of at 
   most W Kg and a height of at least H cm.Chef weights 60 Kg and his height is 130 cm.
   Is Chef allowed to enter the water slide? */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List; // Add import for List

class Water_Park 
{
    int x;
    int y;

    public Water_Park(int x, int y) 
	{
        this.x = x;
        this.y = y;
    }

    public String Water_Park1() 
	{  // Change return type to String
        int weight = 60; // Correct variable name
        int height = 120;

        if (weight <= x && height >= y) 
		{
            return "Yes";
        } else 
		{
            return "No";
        }
    }

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first water park:");
        int x = in.nextInt();
        System.out.println("Enter the second water park:");
        int y = in.nextInt();
        
        List<Water_Park> park = new ArrayList<>(); // You may want to add Water_Park objects to the list

        // Example of creating and using Water_Park objects
        Water_Park park1 = new Water_Park(x, y);
        System.out.println("Is the person allowed in the water park? " + park1.Water_Park1());
    }
}
