/* Unfortunately, this means he now has to pack up his things so that they can be moved too. Currently, Chef is
   packing up his (rather impressive) book collection into cardboard boxes.
   Chef has X shelves of books, each of which contains exactly Y books. Each cardboard box can hold at most 
   Z books. In order to not mess up the organization of the books, Chef will also ensure that books from different 
   shelves will not be placed in the same box. */

import java.util.Scanner;
public class Packing_Books
{
	public int BooksCollection(int x,int y,int z)
	{
		if((y%z)==0)
		{
			return (x*y)/z;
		}
		else
		{
			return ((y/z)+1)*x;
		}
		
	}
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first books boxes:");
		int x=in.nextInt();
		System.out.println("Enter the second books boxes:");
		int y=in.nextInt();
		System.out.println("Enter the third books boxes:");
		int z=in.nextInt();
		
		Packing_Books b=new Packing_Books();
		int res=b.BooksCollection(x,y,z);
		System.out.println("Book collection into cardboard boxes:"+res);
	}
}