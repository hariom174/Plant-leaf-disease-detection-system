/* Chef invented a modified wordle.
   There is a hidden word S and a guess word T, both of length 5.Chef defines a string M to determine the 
   correctness of the guess word. For the ith index:
   If the guess at the ith index is correct, the ith character of M is G.
   If the guess at the ith index is wrong, the ith character of M is B. */

import java.util.Scanner;

class Wordle
{
    String m;
    String s;

    public Wordle(String m, String s) 
	{
        this.m = m;
        this.s = s;
    }

    public String HiddenWord(String m, String s) 
	{
        String x = "";
        for (int i = 0; i < m.length(); i++) 
		{
            if (m.charAt(i) == s.charAt(i)) 
			{
                x += 'G';
            } else 
			{
                x += 'B';
            }
        }
        return x;
    }

    public void display() 
	{
        System.out.println("Displaying...");
    }

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first character:");
        String m = in.next();
        String s = in.next();

        Modifier modifier = new Modifier(m, s);

        // Use the HiddenWord method
        String result = modifier.HiddenWord(m, s);
        System.out.println(result);

        // Corrected method name: display()
        modifier.display();
    }
}
