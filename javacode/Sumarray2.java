                        /* Write a program to sum values of an array: */

public class Sumarray2 {
    public static void main(String[]args)
    {
        int[] arr1={
            1,2,3,4,5,6,7,8,9,10};
            int sum=0;
            for(int i:arr1)
            {
                sum+=i;
            }
            System.out.println("The sum is:"+sum);
    }
    
}
