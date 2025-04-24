import java.util.Scanner;

import javax.swing.plaf.synth.SynthSliderUI;

public class Squareofeven {
    public static void main(String[]args)
    {
        int x,i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a square of all even number:");
        x=in.nextInt();
        for(i=2;i<=x;i++)
        {
            if(x%2==0)
            {
               System.out.println("Square of all even number is:"+i);
               System.out.println(i*i);

            }
        }
    }
}
