/* Write a program to print 3 number on a line, starting with 1 and printing n lines.
   Accept the number of lines(n,integer) from the user.*/
   
import java.util.Scanner;

public class Starting {
    public static void main(String[]args)
    {
        int i,n,j=1,temp=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number;");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            while(temp<3)//
            {
                System.out.println( +j++);
                temp ++;
            }
            temp=0;
        }  
        
    }
    
}
//output is 1 to 15