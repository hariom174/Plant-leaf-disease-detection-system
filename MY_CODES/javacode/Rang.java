import java.util.Scanner;

public class Rang{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num>=0&&num<=20)
        {
            System.out.println("Range is [0,20]");
        }
        else if(num>=21&&num<=40)
        {
            System.out.println("Range is [21,40]");
        }
        else if(num>=41&&num<=60)
        {
            System.out.println("Range is [41,60]");
        }
        else if(num>=61&&num<=80)
        {
            System.out.println("Range is [61,80]");
        }
        else
        {
            System.out.println("Outside range");
        }
    }
    
}
