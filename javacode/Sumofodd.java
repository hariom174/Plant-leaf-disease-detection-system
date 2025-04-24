import java.util.Scanner;

public class Sumofodd {
    public static void main(String[]args)
    {
        float p;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the perimeter of traingle:");
        float x=in.nextFloat();
        float y=in.nextFloat();
        float z=in.nextFloat();
        if(x<(y+z) && y<(x+z) && z<(y+x))
        {
            p=x+y+z;
            System.out.println("Perimeter of traingle is :"+p);
        }
        else
        {
            System.out.print("Not possible to create a traingle:");
        }      
    }
    
}
