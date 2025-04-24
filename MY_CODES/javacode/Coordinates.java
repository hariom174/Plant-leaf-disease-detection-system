/* Write a program to read the coordinates (X,Y) (in the Cartesian system) and find the quadrant to which
   it belong (Quadrant-1,Quadrant-2,Quadrant-3,Quadrant-4.) */
 
/*  Note:- A cartesian coordinate system is a coordinate system that specifies each point uniquely in a 
           plane by a pair of numerical coordinates. */

import java.util.Scanner;

public class Coordinates {
    public static void main(String[]args)
    {
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the coordinate (X,Y)/n");
        System.out.println("x Coordinate 1:");
        x=in.nextInt();
        System.out.println("Y coordinates:");
        y=in.nextInt();

        if(x>0 && y>0)
        {
            System.out.println("Quadrant -1 (+,+)");//(Zero sha la kar pi/2)
        }
        else if(x>0 && y<0)
        {
            System.out.println("Quadrant -2 (+,-)");//(pi/2 sha la kar pi)
        }
        else if(x<0 && y<0)
        {
            System.out.println("Quadrant-3 (-,-)");//(pi sha la kar 3pi/2)
        }
        else if(x<0 && y>0)
        {
            System.out.println("Quadrant-4 (-,+)");//(3pi/2 sha la kar 2pi tak)
        }
        else
        {
            System.out.println("It is not a Quadrant equation:");
        }

    }
    
}
