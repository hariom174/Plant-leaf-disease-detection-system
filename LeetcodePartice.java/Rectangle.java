/* Write  a java program to check if a given rectangle. */


package com.Nit;
import java.util.Scanner;
public class Rectangle{
    public static void main(String[]args)
 {
    Rectangle obj=new Rectangle();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Length of Rectangle");
    int l=in.nextInt();
    System.out.println("Enter the Breadth of Rectangle");
    int b=in.nextInt();
    int area=l*b;
    System.out.println("Area of Rectangle :"+area);
 }
   
}