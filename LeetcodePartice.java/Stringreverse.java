/* Write a java program to recursive method to reverse a given string. */

import java.util.Scanner;
public class StringReverse{
     public String reverse(String str)
     {
        //Base case: if the string is empty or has only character ,it is reversed
        
       if(str.isEmpty() || str.length()==1)
       {
          return str;
       }
       //Recursive case: reverse the substring starting from the second character and concatenate the first character
       
      return reverse(str.substring(1)) + str.charAt(0);
  }
  public static void main(String[]args)
  {
    StringReverse A=new StringReverse();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the name:");
    String s=in.nextLine();
    System.out.println("Reverse character is:"+A.reverse(s));
  }
   
}