/* There is a bus with 30 seats. The seats are numbered from 1 to 30, and the numbering is as depicted in 
   this image. */
   
import java.util.Scanner;
class Bus
{
	public String BusSeat(int n)
	{
		if(n>=1 && n<=10)
		{
			return "Lower Double";
		}
		else if(n>=10 && n<=15)
		{
			return "Lower Signal";
		}
		else if(n>=16 && n<=25)
		{
			return "Upper Double";
		}
		else if(n>=25 && n<=30)
		{
			return "Upper Signal";
		}
		else 
		{
			return "Not Bus seats";
		}
	}
}
class Seat extends Bus
{
	public String BusSeat(int n)
	{
		return super.BusSeat(n);
	}
}
class  Bus_Seat_Numbering
{
	public static void main(String...args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the bus seats number:");
		int n=in.nextInt();
		Seat s=new Seat();
		String result=s.BusSeat(n);
		System.out.println(result);
	}
}

