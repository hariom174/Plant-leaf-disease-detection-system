import java.util.Scanner;

public class Distance {
    public static void main(String[]agrs)
    {
        Scanner fl=new Scanner(System.in);
        System.out.println("Enter x1 number:");
        float x1=fl.nextFloat();
        System.out.println("Enter y1 number:");
        float y1=fl.nextFloat();
        System.out.println("Enter x2 number");
        float x2=fl.nextFloat();
        System.out.println("Enter y2 number");
        float y2=fl.nextFloat();
        float sqrtGdistance;
        sqrtGdistance=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        System.out.println("The distance between two point ="+sqrtGdistance);
    }   
}
