 /* Chef appeared for an exam consisting of 3 sections. Each section is worth 100 marks.Chef scored 
    A marks in Section 1, B marks in section 2, and C marks in section 3.
    Chef passes the exam if both of the following conditions satisfy:
	Total score of Chef is ≥100;
	Score of each section ≥10. */
	
import java.util.Scanner;
class Marks
{
	public Marks()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first student marks:");
		int a=in.nextInt();
		System.out.println("Enter second student marks:");
		int b=in.nextInt();
		System.out.println("Enter third student marks:");
		int c=in.nextInt();
		int d=a+b+c;
		
		if(a>=10 && b>=10 && c>=10 && d>=100)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
class Score extends Marks
{
	public Score()
	{
		super();
	}
}
public class Student
{
	public static void main(String[]args)
	{
		Score s=new Score();
		
	}
}
