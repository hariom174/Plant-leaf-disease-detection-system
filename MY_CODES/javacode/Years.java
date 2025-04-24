import java.time.Year;
import java.util.Scanner;

public class Years {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a days");
        int ndays=in.nextInt();
        int years,month,days;
        years=(int)ndays/365;
        ndays=ndays-(365*years);
        month=(int)ndays/30;
        days=(int)ndays-(month*30);
        System.out.println("Years ="+years);
        System.out.println("Ndays ="+ndays);
        System.out.println("Month ="+month);
        System.out.println("Days ="+days);
    }
    
}
