/* Write a program that reads two number and divides the first number by the second number.
   If division is not posssible print "Division is not possible: " */

import java.util.Scanner;

public class Divides {
    public static void main(String[]argd)
    {
        int x,y;//integer value
        float divi_sion;//float value 
        Scanner Fl=new Scanner(System.in);
        System.out.println("Enter the two number and division:");
        x=Fl.nextInt();
        y=Fl.nextInt();
            divi_sion=x/y;
            System.out.println("The first number of and second number divides is :"+divi_sion);
    }
}
