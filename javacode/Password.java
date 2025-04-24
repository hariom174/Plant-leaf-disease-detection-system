/* Write a program to read a password util it is valid.for wrong password print''Incorrect password": 
 and Correct password */

import java.util.Scanner;

public class Password {
    public static void main(String[]args)
    {
        int Userpassword,password=1234;

        /*logical statement */
        while(password!=0)
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter a password:");
            Userpassword=in.nextInt();
            /* correct password and incorrect password */
            if(Userpassword==password)
            {
                System.out.println("Correct password:");
                password=0;
            }
            else
            {
                System.out.println("Wrong password !try again");
            }
        }
    }
}