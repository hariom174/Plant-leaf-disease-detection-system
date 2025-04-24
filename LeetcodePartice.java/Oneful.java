/* Chef defines a pair of positive integers (a,b) to be a Oneful Pair Oneful Pair, if a+b+(a*b)=111.
  For example (1,55)(1,55) is a Oneful Pair,since 1+55+(1*55)=56+55=111.
  But (1,56) is not a Oneful Pair, since 1+56+(1⋅56)=57+56=113≠111. */
  
import java.util.Scanner;
// this is my parent class
class O{

	public O(int a,int b)
	{
		if((a+b)+(a*b)==111)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
    }
}
   // this is my child class
	 class B extends O 
    {
        public  B(int a,int b)
        {
        super(a,b);
        }
   }

    public class Oneful
    {
    public static void main(String[]args)
	{
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the a number:");
       int a=in.nextInt();
       System.out.println("Enter the b number:");
       int b=in.nextInt();

       B b1=new B(a,b);
        
	}
}


 //Here are the key changes:

//Removed the inner class B inside O. B should be a separate class.
//Added constructor parameters to the B class so that it can receive a and b values.
//Moved the Scanner and input prompts to the main method in the Oneful class.
//Created an instance of B in the main method with the provided a and b values.
