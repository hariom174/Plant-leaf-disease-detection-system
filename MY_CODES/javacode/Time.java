import java.util.Scanner;

public class Time {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a seconds:");
        int seconds=in.nextInt();
        int hours,minutes;
        hours=(seconds/3600);
        minutes=(seconds-(3600*hours))/60;
        seconds=(seconds-(3600*hours)-(minutes*60));
        System.out.println("Hours ="+hours);
        System.out.println("Minutes ="+minutes);
        System.out.println("Seconds ="+seconds);
    }
    
}
