/* Alice and Bob are playing a game of basketball against each other, one-versus-one.Currently, Alice has
   A points, and Bob has B points.Each shot of a player can score either 2 or 3 points.
   Alice isn't just out to win - she wants to win in dominant fashion.
   Alice believes that her win is dominant if she ends the game with at least 10 points more than Bob.
   If Alice is able to prevent Bob from scoring any more points, what's the minimum number of shots she 
   further needs to get a dominant victory? */

import java.util.Scanner;
import java.util.InputMismatchException;

// It should be 'Thread' instead of 'thread' - Java is case-sensitive.
class PlayingThread extends Thread {
    protected int x;
    protected int y;

    // Scanner should not be passed here. It's better to create a new Scanner in the run method.
    public PlayingThread(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() { // Method name should be 'run', not 'Points'.
        try {
            int z = y - x + 10;

            if (x - y >= 10) {
                System.out.println(0);
            } else {
                if (z % 3 == 0) {
                    synchronized (this) { // Synchronized block should be properly closed.
                        System.out.println(z / 3);
                    }
                } else {
                    System.out.println((z - 10) / 3);
                }
            }
        } catch (ArithmeticException e) { // InputMismatchException is not appropriate here.
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
    }
}

    class Extreme_Basketball {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first player:");
        int x = 0;
        int y = 0;
        try {
            x = in.nextInt(); // Input validation should be done here.
            System.out.println("Enter the second player:");
            y = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            System.exit(1); // Exit the program if input is invalid.
        }

        // Create a new instance of the thread and start it.
        PlayingThread p = new PlayingThread(x, y);
        p.start();

        // Do not attempt to catch InputMismatchException here, it should be caught where input is taken.
    }
}
