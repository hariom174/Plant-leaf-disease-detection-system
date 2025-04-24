import java.util.Scanner;

public class Perimeter {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int radius=in.nextInt();
        System.out.println("perimeter is ="+(2*radius*Math.PI));
        System.out.println("area is ="+(Math.PI*radius*radius));
    }
    
}
