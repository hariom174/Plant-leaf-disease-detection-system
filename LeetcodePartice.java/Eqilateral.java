/* Write a java program to find the area of an equilateral traingel.*/

import java.util.Scanner;
   class Equilateral
   {
     public static void main(String[]args)
	 {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the equilateral traingel:");
		double t=in.nextDouble();
		System.out.println("Area of rigth angle traingel:"+traingel(t));
	 }
	  private static double traingel(double t)
	  {
	     return (Math.sqrt(4/3.0)*(t*t));
	  }
}

