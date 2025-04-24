/*Write a program to check whether a given integer is positve even,negative even,positive odd,negative 
 odd.print even if number is 0.*/

import java.util.Scanner;

public class Positiveeven {
    public static void main(String[]args)
    {
        int x;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number is:");
        x=in.nextInt();
        
        if(x==0)
        {
            System.out.println("Positive");
        }
        else if(x<0 &&(x%2)!=0)
        {
            System.out.println("Negativeodd");
        }
        else if(x<0 && (x%2)==0)
        {
            System.out.println("Negativeeven");
        }
        else if(x>0 && (x%2)!=0)
        {
            System.out.println("Positiveodd");
        }
        else if(x>0 && (x%2)==0)
        {
            System.out.println("Positiveeven");
        }
        else
        {
            System.out.println("It is a not positiveodd and negativeeven");
        }
    }
}
