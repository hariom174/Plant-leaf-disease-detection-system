import java.util.Scanner;

public class Marks {
    public static void main(String[]args)
    {
        Scanner mn=new Scanner(System.in);
        System.out.println("Enter the three subject marks");
        int maths=mn.nextInt();
        int phy=mn.nextInt();
        int chem=mn.nextInt();

        if(maths>=40&&phy>=40&&chem>=40)
        {
            System.out.println("Pass ");
        }
        else
        {
            System.out.println("Fail");
        }
        
        
    }
}
