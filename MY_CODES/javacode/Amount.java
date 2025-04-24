import java.util.Scanner;

public class Amount {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount=in.nextInt();
        int total;
        
        total=(int)amount/100;
        System.out.println("Notes of 100.00 ="+total);
        amount=amount-(total*100);
        total=(int)amount/50;
        System.out.println("Notes of 50.00 ="+total);
        amount=amount-(total*50);
        total=(int)amount/20;
        System.out.println("Note of 20.00 ="+total);
        amount=amount-(total*20);
        total=(int)amount/10;
        System.out.println("Note of 10.00 ="+total);
        amount=amount-(total*10);
        total=(int)amount/5;
        System.out.println("Notes of 5.00 ="+total);
        amount=amount-(total*5);
        total=(int)amount/2;
        System.out.println("Notes of 2.00 ="+total);
        amount=amount-(total*2);
        total=(int)amount/1;
        System.out.println("Notes of 1.0 ="+total);
    }
    
}
