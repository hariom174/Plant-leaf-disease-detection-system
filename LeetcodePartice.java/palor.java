import java.util.Scanner;

public class Palindrome {
    static int fibo(int n)
    {
        static void printN(int n)
        {
            static int countDigits(int n)
            {
                static int sumofDigit(int n)
                {
                   static String reverseString(String s,String r,int i)
                   {
                    if(n<0)
                    {
                        return r;
                    }
                    return reverseString(s,r+s.charAt(i),i-1);
                    
                   }
                }
            }
        }
    }
    public static void main(String...args)
    {
        Palindrome obj=new Palindrome();
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(obj.reverseString(s," ",s.length()-1));
    }
        
    
}


