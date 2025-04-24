import java.util.Scanner;

public class Swapping {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number");
        int x=sc.nextInt();
        System.out.println("Enter a second number");
        int y=sc.nextInt();
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping number");
        System.out.println("X number is:="+x);
        System.out.println("Y number is:="+y);


    }
    
}
