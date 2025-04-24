/* For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right 
   and replace the characters as follows:
   1.00 is replaced with A
   2.01 is replaced with T
   3.10 is replaced with C
   4.11 is replaced with G
   Given a binary string S of length (N is even), find the encoded sequence. */
 
import java.util.Scanner;

class Encoding 
{
    int n;
    String str;

    // Constructor for Encoding class
    Encoding(int n, String str) 
	{
        this.n = n;
        this.str = str;
    }
}

class Replaced extends Encoding 
{
    // Constructor for Replaced class
    Replaced(int n, String str) 
	{
        super(n, str);
    }

    public String replaceBinary() 
	{
        String result = "";

        for (int i = 0; i < n; i += 2) 
		{
            if (str.charAt(i) == '0' && str.charAt(i + 1) == '0') 
			{
                result += "A";
            } else if (str.charAt(i) == '0' && str.charAt(i + 1) == '1') 
			{
                result += "T";
            } else if (str.charAt(i) == '1' && str.charAt(i + 1) == '0') 
			{
                result += "C";
            } else 
			{
                result += "G";
            }
        }

        return result;
    }
}

public class DNA_Storage 
{
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the binary string:");
        int n = in.nextInt();
        System.out.println("Enter the binary string:");
        String str = in.next();

        Replaced r = new Replaced(n, str);
        String res = r.replaceBinary();
        System.out.println("Encoded sequence: " + res);
    }
}
