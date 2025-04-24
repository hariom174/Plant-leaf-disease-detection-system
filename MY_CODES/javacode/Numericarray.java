              /* Write a java program to short a numeric array and a string array: */

import java.util.Arrays;

public class Numericarray {
    public static void main(String[]args)
    {
        int[] my_array1 ={
                 1789,2035,1899,1456,2013,
                 1458,2458,1254,1472,2365,
                 1458,1456,2165,1457,2456};
        
                 
        String[] my_array2 ={
                 " java ",
                 "Python","PHP","Spring",
                 "C++","C program","C#"};

        System.out.println("Enter the no of elments:"+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sortest numerical array:"+Arrays.toString(my_array1));

        System.out.println("Original string array:"+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sortest string array:"+Arrays.toString(my_array2));

    }
    
}
