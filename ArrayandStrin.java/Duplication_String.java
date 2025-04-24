/* Write a program to find a duplication value of string value: */

import java.util.Scanner;
public class Duplication_String
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the character value:");
		String str=in.nextLine();
		str = str.toLowerCase();
		String word[]=str.split("");
		int count=0;
		

		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
				
				if(word[i].equals(word[j]))
				{
					count++;
				    word[j]="0";
				}
			}
			if(count>1 && word[i]!="0")
			{
				System.out.println("Duplication Word in string:"+word[i]);
			}
		}
	}
}