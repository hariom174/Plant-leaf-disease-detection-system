import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Maximum {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the x number:");
        int x=in.nextInt();
        System.out.println("Enter the y number:");
        int y=in.nextInt();
        System.out.println("Enter the z number:");
        int z=in.nextInt();
        if((x>=y)&&(x>=z))
        {
            System.out.println("It is the maximum number:"+x);
        }
        else if((y>=x)&&(y>=z))
        {
            System.out.println("It is the maximum number:"+y);
        }
        else 
        {
            System.out.println("It is the maximum number:"+z);
        }
    }
    
}
