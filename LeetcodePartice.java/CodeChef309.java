/*  Chef is eagerly waiting for a piece of information. His secret agent told him that this information
  would be revealed to him after K weeks.X days have already passed and Chef is getting restless now. 
  Find the number of remaining days Chef has to wait for, to get the information.It is guaranteed that 
  the information has not been revealed to the Chef yet. */
  
import java.util.Scanner;
public class Week_day
{
	private int week;
	private static int time;
	
	private Week_day(int week,int time)
	{
		this.week=week;
		this.time=time;
	}
	void display()
	{
		System.out.println((week*7)-time);
	}
	
		public static void main(String[]args)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the week:");
			int week=in.nextInt();
			System.out.println("Enter the time:");
			int time=in.nextInt();
			Week_day d1=new Week_day(week,time);
			d1.display();
		}
	
}