/*Write a java program that reads an integer between 1 and 12 and prints the month of the year in English*/
import java.util.Scanner;
public class Month{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int month=in.nextInt();
        switch(month)
        {
            case 1:
            System.out.println("January");
            break;
            
            case 2:
            System.out.println("February");
            break;

            case 3:
            System.out.println("March");
            break;
            
            case 4:
            System.out.println("April");
            break;

            case 5:
            System.out.println("May");
            break;

            case 6:
            System.out.println("June");
            break;

            case 7:
            System.out.println("July");
            break;

            case 8:
            System.out.println("August");
            break;

            case 9:
            System.out.println("September");
            break;

            case 10:
            System.out.println("October");
            break;

            case 11:
            System.out.println("November");
            break;
            
            case 12:
            System.out.println("December");
            break;
            
            default:
            System.out.println("Input a number between 1 to 12:");
        }
    }
   
}
