import java.util.Scanner;

public class String {
    public static void main(String[]args)
    {
        int i,size,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no array elements:");
        size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter X-array of elements:");

        for(i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
    
        for(i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of array elements:"+sum);
   }
}
