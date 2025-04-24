import java.util.Scanner;

public class Negative {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        
        if(n>0)
        {
            System.out.println("Positive number:");
        }
        else if(n<0)
        {
            System.out.println("Negative number:");
        }
        else
        {
            System.out.println("Zero number");
        }
    }
}
