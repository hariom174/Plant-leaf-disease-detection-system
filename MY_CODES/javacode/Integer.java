import java.util.Scanner;

public class Integer {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the four integer value of p,q,r,s:");
        int P=in.nextInt();
        int Q=in.nextInt();
        int R=in.nextInt();
        int S=in.nextInt();
        if((Q>R)&&(S>P)&&((R+S)>(P+Q))&&(R>0)&&(S>0)&&(P%2==0))
        {
            System.out.println("Correct value:");
        }
        else
        {
            System.out.println("Wrong value:");
        }
    }
}
