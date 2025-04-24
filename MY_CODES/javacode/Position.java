/* Accepts some integer from the user and find the highest value and the input position. */

import java.util.Scanner;

public class Position {
    public static void main(String[]args)
    {
        /* Varaible Declaration */
        int i,n,number,higest=0,p=0;
        /* User Interface */
        System.out.println("Enter the number of inputs are willing to provide:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        number=in.nextInt();
        /*  Logical of the porgram */
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number is:"+i+1);   
            if(number>higest)
            {
                higest=number;
                p=i+1;

            }
        }
        System.out.println("The higest value of the input is:"+higest);
        System.out.println("Th position of the input is:"+p);

    }
}
