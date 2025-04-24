import java.util.Scanner;
public class Employe
{
    private int id;
	private String name;
	private long acount;
	private double bal;
	
	double getdisp()
    {
        return bal;
    }
	public void getbal(double amount)
	{
	   bal=bal+amount;
	}
	public static void main(String[]args)
	{
	   Employe obj=new Employe();
       obj.id=123;
       obj.name="Rahul";
       obj.acount=2345;
       obj.bal=1000.0;
       obj.getbal(1234.5); 
       System.out.println("Mr."+obj.name+" your Current Bal :"+obj.getdisp());
	}
	
}