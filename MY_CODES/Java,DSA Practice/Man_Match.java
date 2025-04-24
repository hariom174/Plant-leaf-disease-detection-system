/* In a cricket match, there are two teams, each comprising 11 players. The scorecard of the match lists the runs scored
   and wickets taken by each of these 22 players.To determine the "Man of the Match", we assess each player's 
   performance. Points are awarded to a player as follows:
   Each run scored earns 1 point.
   Every wicket taken earns 20 points.
   The player with the highest total points is awarded the "Man of the Match" title.You are given the scorecard of a 
   cricket match, listing the contributions of all 22 players.The players are numbered from 1 to 22. Find the "Man of 
   the Match".
   It is guaranteed that for all inputs to this problem, the "Man of the Match" is unique.
   Note: A player who belongs to the losing team can also win the "Man of the Match" award. */
   
import java.util.Scanner;
import java.util.InputMismatchException;

class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int runs, int wickets) {
        this.score += runs + wickets * 20; // Adjust as per the scoring system
    }
}

class MatchThread extends Thread {
    private Player[] players;

    public MatchThread(Player[] players) {
        this.players = players;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            for (Player player : players) {
                System.out.println("Enter runs and wickets taken by " + player.getName() + ":");
                int runs = scanner.nextInt();
                int wickets = scanner.nextInt();
                player.addScore(runs, wickets);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}

public class Man_Match {
    public static void main(String... args) {
        Player[] players = new Player[22];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player " + (i + 1));
        }

        MatchThread matchThread = new MatchThread(players);
        matchThread.start();

        try {
            matchThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        Player manOfTheMatch = getManOfTheMatch(players);
        System.out.println("Man of the Match: " + manOfTheMatch.getName());
    }

    private static Player getManOfTheMatch(Player[] players) {
        Player manOfTheMatch = players[0];
        for (int i = 1; i < players.length; i++) {
            if (players[i].getScore() > manOfTheMatch.getScore()) {
                manOfTheMatch = players[i];
            }
        }
        return manOfTheMatch;
    }
}
