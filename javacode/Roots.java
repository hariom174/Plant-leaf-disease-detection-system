import java.util.Scanner;

public class Roots{
    public static void main(String[]arga)
    {
        Scanner fl=new Scanner(System.in);
        System.out.println("Enter the first numbers:");
        float a=fl.nextFloat();
        System.out.println("Enter the seconds numbers:");
        float b=fl.nextFloat();
        System.out.println("Enter the third numbers:");
        float c=fl.nextFloat();
        double ptr;
        double Root1,Root2;
        
        ptr=(b*b)-((4)*(a)*(b));

        if(ptr>=0&&a!=0)
        {
            Root1=(-b+(Math.sqrt((b*b)-4*a*c))/(2*a));
            Root2=(-b-(Math.sqrt((b*b)-4*a*c))/(2*a));
            System.out.println("Root1 value is =%.5lf\n"+Root1);
            System.out.println("Root2 value is =%.5lf"+Root2);
        }
        
    }
}