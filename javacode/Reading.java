import java.io.DataInputStream;

 class Reading {
    
    public static void main(String[]args)
    {
         DataInputStream  in=new DataInputStream(System.in);
         int intNumber=0;
         float floatNumber=0.0f;
         {
            System.out.println("Enter an Integer");
            intNumber= Integer.paraseInt(in.reading());
            System.out.println("Enter a float number");
            floatNumber=float.valueof(in.reading()).floatvalue();
         }
         catch (Exception e){}
         System.out.println("intNumber="+intNumber);
         System.out.println("floatNumber="+floatNumber);
   
        }
    }
}
