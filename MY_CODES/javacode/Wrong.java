import java.util.Scanner;
public class Wrong {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first numbers:");
        int p=in.nextInt();
        System.out.println("Enter the second number:");
        int q=in.nextInt();
        System.out.println("Enter the thrid numbers:");
        int r=in.nextInt();
        System.out.println("Enter the sum of numbers:");
        int s=in.nextInt();

        if((q>r)&&(s>p)&&((r+s)>(p+q))&&(r>0)&&(s>0)&&(p%2==0))
        {
            System.out.println("This is a Correct values");
        }
        else
        {
            System.out.println("Wrong");
        }
    }
}