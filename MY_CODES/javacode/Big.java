import java.util.Scanner;

public class Big {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int big;
        big=x;
        if(y>big)
        {
            big=y;
        }
        if(z>big)
        {
            big=z;
            System.out.println("It is the biggest number:"+big);
        }

    }
}
