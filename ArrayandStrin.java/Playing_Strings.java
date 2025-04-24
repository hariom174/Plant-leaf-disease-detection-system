/* Chef usually likes to play cricket, but now, he is bored of playing it too much, so he is trying new games 
   with strings. Chef's friend Dustin gave him binary strings S and R, each with length N, and told him to make 
   them identical. However, unlike Dustin, Chef does not have any superpower and Dustin lets Chef perform only 
   operations of one type: choose any pair of integers (i,j) such that 1≤i,j≤N and swap the i-th and j-th 
   character of S. He may perform any number of operations (including zero). */
 
import java.util.Scanner;
public class Playing_Strings
{
	public static String playwithcricket(int n,String s,String r)
	{
		int st=0,count=0;
		for(int i=0;i<n;i++)//iterate through the character of the strings.
		{
			if(s.charAt(i)=='0')
			{
				st++;
			}
			if(r.charAt(i)=='0')
			{
				count++;
			}
		}
		if(st!=count)
		{
			return "NO";
		}
		else
		{
			return "Yes";
		}
		
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the lenght of string:");
		int n=in.nextInt();
		System.out.println("Enter the first string number:");
		String s=in.next();
		System.out.println("Enter the second string number:");
		String r=in.next();
		
		String str=playwithcricket(n,s,r);
		System.out.println(str);
	}
}

