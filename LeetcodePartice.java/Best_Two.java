/* Alice and Bob are playing a game. Each player rolls a regular six faced dice 3 times.The score of a player is
 the sum of the values of the highest 2 rolls. The player with the highest score wins, and the game ends in a 
 Tie if both players have the same score.
 Find the winner of the game or determine whether it is a tie. */

import java.util.Scanner;

class Player {
    int a1;
    int a2;
    int a3;
    int b1;
    int b2;
    int b3;

    public Player(int a1, int a2, int a3, int b1, int b2, int b3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }
}

class Team_Score extends Player {
    public Team_Score(int a1, int a2, int a3, int b1, int b2, int b3) {
        super(a1, a2, a3, b1, b2, b3);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first a1 number:");
        a1 = in.nextInt();
        System.out.println("Enter the second a2 number:");
        a2 = in.nextInt();
        System.out.println("Enter the third a3 number:");
        a3 = in.nextInt();
        System.out.println("Enter the first b1 number:");
        b1 = in.nextInt();
        System.out.println("Enter the second b2 number:");
        b2 = in.nextInt();
        System.out.println("Enter the third b3 number:");
        b3 = in.nextInt();

        int a = Math.min(a1, Math.min(a2, a3));
        int b = Math.min(b1, Math.min(b2, b3));
        int x = a1 + a2 + a3 - a;
        int y = b1 + b2 + b3 - b;

        if (x > y) {
            System.out.println("Alice");
        } else if (x < y) {
            System.out.println("Bob");
        } else {
            System.out.println("Tie");
        }
    }
}

public class Best_Two {
    public static void main(String[] args) {
        Team_Score t = new Team_Score(0, 0, 0, 0, 0, 0);
    }
}
