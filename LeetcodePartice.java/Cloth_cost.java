/*  Chef wants to buy masks to last him 100 days. He will buy the masks which cost him the least.
    In case there is a tie in terms of cost, Chef will be eco-friendly and choose the cloth masks. 
	Which type of mask will Chef choose? */

import java.util.Scanner;
class Cloth
{
   public Cloth()
   {
      Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int x=in.nextInt();
	  System.out.println("Enter the y number:");
	  int y=in.nextInt();
	  
	  if(x*100>=y*10)
	  {
	     System.out.println("Cloth");
	  }
	  else
	  {
	    System.out.println("Disposable");
	  }
   }
}
class cost extends Cloth
{
   public cost()
   {
      super();
   }
}
class Cloth_cost
{
   public static void main(String[]args)
   {
       cost c=new cost();
   }
}
