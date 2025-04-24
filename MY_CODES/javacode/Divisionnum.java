/* Print all number between 1 to 100 which divided by a specified number and the remainder will be 3. */



public class Divisionnum {
    public static void main(String[]args)
    {
        int x;
        System.out.println("Enter a value is 1 to 100:");

        for(x=1;x<=100;x++)
        {
            if(x%3==0)
            {
                System.out.println(x);
            }
        }
    }
}