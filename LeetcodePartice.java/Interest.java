  /* Simple interest is a quick method of calculating the interest charge on a loan. Simple interest is 
   determined by multiplying the daily interest rate by the principal by the number of days that elapse 
   between payments. */


import java.util.Scanner;
   public class SimpleInterset
   {
      private float price;
	  private float rate;
	  private float time;
	  
	  
	  public SimpleInterset(float p,float r,float t)
	  {
	     this.price=p;
		 this.rate=r;
		 this.time=r;
		
	  }
	  public void Simple()
	  {
		 float p=price;
		 float r=rate;
		 float t=time;
	     
	     float total=((p*r*t)/100);
		 System.out.println("Total Simple interest is:"+total);
		 
	  }
	     public static void main(String[]args)
		 {
		    Scanner in=new Scanner(System.in);
			System.out.println("Enter the price:");
			float p=in.nextFloat();
			System.out.println("Enter the rate:");
			float r=in.nextFloat();
			System.out.println("Enter the time:");
			float t=in.nextFloat();
		    SimpleInterset obj=new SimpleInterset(p,r,t);
			
			obj.Simple();
		 
	  }
   }
