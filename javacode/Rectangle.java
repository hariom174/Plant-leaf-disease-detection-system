import java.util.Scanner;

//Write a java program to print the area and perimeter of rectangle
public class Rectangle {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int length=0;
        int breadth=0;
        int area=0;
        int perimeter=0;
        System.out.println("Enter the length of rectangle:");
        length=in.nextInt();
        System.out.println("Enter the area of perimeter:");
        breadth=in.nextInt();

        area=length*breadth;
        perimeter=2*(length+breadth);
        
        System.out.println("The area of rectangle ="+area);
        System.out.println("The perimeter of rectangle ="+perimeter);
    }

    
}
