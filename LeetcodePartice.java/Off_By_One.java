/* You just bought a new calculator, but it seems to have a small problem: all its results have an extra 
     1 appended to the end.
    For example, if you ask it for 3 + 5, it'll print 81, and 4 + 12 will result in 161.Given A and 
    B, can you predict what the calculator will print when you ask it for A+B? */

import java.util.Scanner;

class Off {
    int a;
    int b;

    public Off(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class By extends Off {
    public By(int a, int b) {
        super(a, b);
        int c = a + b;
        int sum = c * 10;
        int x = sum + 1;
        System.out.println("you just bought a new calculator:" + x);
    }
}

class one extends By {
    public one(int a, int b) {
        super(a, b);
    }
}

class Off_By_One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = in.nextInt();//3
        System.out.println("Enter the second number:");
        int b = in.nextInt();//5
        one o = new one(a, b);
    }
}
