import java.util.Scanner;

public class Removeduplicate {
    public static void main(String[]args)
    {
        int i,j,size;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of array elements:");
        size=in.nextInt();
        int[] arr1=new int[size];
        System.out.println("Enter the x-array elements:");

        for(i=0;i<size;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the position of deleted:");
        j=in.nextInt();
        for(i=j-1;i<size-1;i++)
    
            arr1[i]=arr1[i-1];
        
        for(i=0;i<size;i++)
        
            System.out.print(arr1[i]);
        
        
    }
    
}
