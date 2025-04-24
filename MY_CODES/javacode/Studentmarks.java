import java.util.Scanner;

public class Studentmarks {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the avrage marks of three student:");
        int maths=in.nextInt();
        int phy=in.nextInt();
        int chem=in.nextInt();
        float avrg;

        if(maths>=40||phy>=40||chem>=40)
        {
            avrg=(maths+phy+chem)/3;
            System.out.println("Find the avarge number is three student:"+avrg);
        
        if(avrg>=60)
        
            System.out.println("First division:");
        
        else if(avrg>=50)
        
            System.out.println("Second division:");
        
        else

            System.out.println("Third division:");
        }
        else

        System.out.println("Fail");
    }
    
}
