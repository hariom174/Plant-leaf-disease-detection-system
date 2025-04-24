import java.util.Scanner;

public class Biggest {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the three biggest number:");
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();

        if(x>y)
        {
            if(x>z)
            {
                System.out.println("First number is:"+x);
            }
        }
        if(y>x)
        {
            if(y>z)
            {
                System.out.println("Second number is :"+y);
            }
        }
        if(z>x)
        {
            if(z>y)
            {
                System.out.println("Third number is:"+z);
            }
        }
        else
        {
            System.out.println("It is not a biggest number");
        }
    }

}
