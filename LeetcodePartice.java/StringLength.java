/* Write a java program to find the length of the string.*/

import java.util.Scanner;
private class Length
{
    protected String CalculateLength(String str)
    {
     //case1:if the string is empty ,the length is 0

         if(str.isEmpty())
         {
             return str;
         }
         /* case2:remove the first character of the */
         // string and recursively call the method
         // with the remaining substring and add 1 to the length 

        return 1+CalculateLength(str.substring(1));

   }
   public static void main(String[]args)
   {
      Length A=new Length();
      Scanner in=new Scanner(System.in);
      System.out.println("Find the length of the string:");
      String s=in.nextLine();
      System.out.println("Length of the string is:"+A.CalculateLength(s));
   }
}