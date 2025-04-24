/*Write a program that reads 5 numbers counts the number of postive number and print out the 34
all postive number:*/
import java.util.Scanner;
public class Postiveavr {
    public static void main(String[]args)
    {
      int number,postive=0;/*Variable Declaration*/
      Scanner in=new Scanner(System.in);
      System.out.println("Enter a postive number is:");
      int i=in.nextInt();
      number=in.nextInt();
      /* User interface and logic */ 
      for(i=0;i<5;i++)
      {
        if(number>0)
        {
            postive++;
        }
       }
       System.out.println("Number of positive number is:"+postive);
    }
}
