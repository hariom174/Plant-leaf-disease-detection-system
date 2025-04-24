import java.util.Scanner;

public class Average {
    public static void main(String[]args)
    {
        Scanner so=new Scanner(System.in);
        System.out.println("Enter the average number:");
        int x=so.nextInt();
        int y=so.nextInt();
        int z=so.nextInt();
        float avrg;
        avrg=(float)(x+y+z)/3;
        System.out.println("Avearge number is ="+avrg);
    }
    
}
