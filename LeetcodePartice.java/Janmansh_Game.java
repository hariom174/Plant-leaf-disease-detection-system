/* Janmansh and Jay are playing a game. They start with a number X and they play a total of Y moves. Janmansh 
   plays the first move of the game, after which both the players make moves alternatingly.
   In one move, a player can increment or decrement X by 1.If the final number after performing Y moves is even,
   then Janmansh wins otherwise, Jay wins. Determine the winner of the game if h the players play optimally. */

import java.util.Scanner;

class Playing implements Runnable {
    private int a;
    private int b;

    public Playing(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        if ((a + b) % 2 == 0) {
            System.out.println("Janmansh");
        } else {
            System.out.println("Jay");
        }
    }
}

public class Janmansh_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first player:");
        int a = in.nextInt();
        System.out.println("Enter the second player:");
        int b = in.nextInt();

        Runnable game = new Playing(a, b);
        Thread gameThread = new Thread(game);
        gameThread.start();
    }
}
