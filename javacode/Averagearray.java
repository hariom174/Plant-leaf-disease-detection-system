import java.util.Scanner;

public class Averagearray {
    public static void main(String[]args)
    {
        int i,size,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of array elements");
        size=in.nextInt();
        int[] arr1=new int[size];
        
        System.out.println("Enter X-array of elements:");
        for(i=0;i<size;i++)
        {
            arr1[i]=in.nextInt();
        }
        for(i=0;i<size;i++)
        {
            sum =sum+arr1[i];
            float avrgs=sum/arr1[i];
            
            System.out.println("Sum of the array elements:"+sum); 
            System.out.println("Average value of the array elments:"+avrgs);
        }

    }
}
