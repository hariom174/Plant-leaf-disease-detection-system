/* Chef has two numbers A and B.
   In one operation, Chef can choose either A or B and multiply it by 2.Determine whether he can make both A and 
   B equal after any number (possibly, zero) of moves. */

import java.util.Scanner;
import java.util.ArrayList;

class A {
    protected int a; // Declare 'a' as a protected member variable

    public A() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the A number:");
        a = in.nextInt(); // Assign the input value to 'a'
        System.out.println("Enter the B number:");
        int b = in.nextInt();
       
    }
}

class B extends A {
    public B() {
        super();
        ArrayList<String> res = new ArrayList<>(); // Use String instead of Integer

        if (a == 0) {
            res.add("Yes"); // Add a value to the ArrayList
        } else {
            int b = 0; // Declare 'b' as a local variable
            if (a < b) {
                while (a < b) {
                    a *= 2;
                }
            } else if (a > b) {
                while (a > b) {
                    b *= 2;
                }
            }
            res.add((a == b) ? "Yes" : "No");
        }
        System.out.println(res); // Print the result
    }
}

public class Equal_Not {
    public static void main(String[] args) {
        B equal = new B();
    }
}
