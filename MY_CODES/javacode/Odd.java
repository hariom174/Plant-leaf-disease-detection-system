import java.util.Scanner;

public class Odd {
    public static void main(String[]args)
    {
        Scanner so=new Scanner(System.in);
        System.out.println("Enter the n number:");
        int n=so.nextInt();
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }

    }
    
}
