import java.util.Scanner;

public class Division {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three subject marks:");
        int Math=sc.nextInt();
        int phy=sc.nextInt();
        int chem=sc.nextInt();
        int avrg;
        avrg=(Math+phy+chem)/3;
        System.out.println("Avarge number of three subject:"+avrg);

        if(Math<40||phy<40||chem<40)
        {
            System.out.println("Fail ");
        }
        else if(avrg>=60)
        {
            System.out.println("First division:");
        }
        else if(avrg>=50)
        {
            System.out.println("Second division");
        }
        else 
        {
            System.out.println("Third division");
        }
    }
}
