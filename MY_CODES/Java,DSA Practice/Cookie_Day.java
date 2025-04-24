/* Cookie Day
   A very caring mother has N cookie jars with her. Each jar contains a different type of cookie.
   There are Ai cookies in the i-th jar.The mother wanted to give some cookies to her K children, and she decided 
   to only distribute cookies of a single type. That is, she'll choose exactly one of the N jars and distribute the cookies within it.
   She'd like to ensure a couple of things:
   Each child should receive at least 1 cookie.
   Each child should also receive an equal number of cookies, in the spirit of fairness.
   Under the above two conditions, what is the minimum number of "wasted" cookies, i.e, cookies that remain in 
   the chosen jar after distribution?If it is not possible to give out any cookies at all, print −1 instead. */

import java.util.InputMismatchException;
import java.util.Scanner;

class CookieThread extends Thread {
    private int n;
    private int k;
    private Scanner in;
    private int res = Integer.MAX_VALUE;

    public CookieThread(int n, int k, Scanner in) {
        this.n = n;
        this.k = k;
        this.in = in;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < n; i++) {
                int data;
                synchronized (this) {
                    data = in.nextInt();
                }
                if (k > data) {
                    continue;
                } else {
                    synchronized (this) {
                        res = Math.min(res, k % data);
                    }
                }
            }

            if (res == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(res);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            in.close();
        }
    }

    public synchronized int display() {
        return res;
    }
}

public class Cookie_Day {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        CookieThread t = new CookieThread(n, k, in);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("A very caring mother has N cookie jars with her : " + t.display());
    }
}
