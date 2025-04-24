/* Chef decided to redecorate his house, and now needs to decide between two different 
   styles of interior design. */

import java.util.Scanner;
public class House_design
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the first house var:");
	int x1=in.nextInt();
	System.out.println("Enter the Second house var:");
	int x2=in.nextInt();
	System.out.println("Enter the third house var:");
	int y1=in.nextInt();
	System.out.println("Enter the fourth house var:");
	int y2=in.nextInt();
	
	int z1=x1+x2;//first varaible total number 
	int z2=y1+y2;//second
	
	int d=Math.min(z1,z2);
	System.out.println("Maxim number of house styles:"+d);
	
}