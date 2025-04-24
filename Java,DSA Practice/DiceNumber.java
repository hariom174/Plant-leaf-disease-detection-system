/* Alice and Bob are playing a game. Each player rolls a regular six faced dice 3 times.
   The score of a player is the maximum number that can be formed using the rolls.
   The player with the highest score wins, and the game ends in a tie if both players have the same score.
   Find the winner of the game or determine whether it is a tie. */
   

package mypackage;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.*;
import javax.swing.*;

enum Winner {
    Alice,
    Bob,
    Tie
}

@FunctionalInterface
interface CalculateMax {
    int max(int[] a);
}

class Game {
    protected CalculateMax max = (a) -> {
        int p;
        if (a[0] >= a[1] && a[0] >= a[2]) {
            p = (a[0] * 10);
            if (a[1] >= a[2]) {
                p = (p + a[1]) * 10;
                return p + a[2];
            } else {
                p = (p + a[2]) * 10;
                return p + a[1];
            }
        } else if (a[1] >= a[0] && a[1] >= a[2]) {
            p = (a[1] * 10);
            if (a[0] >= a[2]) {
                p = (p + a[0]) * 10;
                return p + a[2];
            } else {
                p = (p + a[2]) * 10;
                return p + a[0];
            }
        } else if (a[2] >= a[0] && a[2] >= a[1]) {
            p = (a[2] * 10);
            if (a[0] >= a[1]) {
                p = (p + a[0]) * 10;
                return p + a[1];
            } else {
                p = (p + a[1]) * 10;
                return p + a[0];
            }
        }
        return 0;
    };

    @Override
    public String toString() {
        return "Game Winner: ";
    }
}

class Codechef extends Game {
    @Override
    protected int max(int a[]) {
        return max.max(a);
    }

    @Override
    public String toString() {
        return "Codechef Winner: ";
    }

    // Unchecked Exception
    public void demonstrateUncheckedException() {
        throw new NullPointerException("Simulated NullPointerException");
    }

    // Checked Exception
    public void demonstrateCheckedException() throws IOException {
        throw new IOException("Simulated IOException");
    }

    // Multithreading
    public void runMultithreading() {
        Runnable task = () -> {
            System.out.println("Running task on thread: " + Thread.currentThread().getName());
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}

public class GameGUI extends JFrame {
    private JTextArea outputArea;

    public GameGUI() {
        setTitle("Game Result");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(e -> {
            startGame();
        });
        add(startButton, BorderLayout.SOUTH);
    }

    private void startGame() {
        Scanner sc = new Scanner(System.in);
        Codechef game = new Codechef();
        StringBuilder output = new StringBuilder();

        System.out.println("Enter the number of test cases: ");
        output.append("Enter the number of test cases: \n");
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline

        while (t-- > 0) {
            int a[] = new int[3];
            int b[] = new int[3];

            System.out.println("Enter three numbers for Alice: ");
            output.append("Enter three numbers for Alice: \n");
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Enter three numbers for Bob: ");
            output.append("Enter three numbers for Bob: \n");
            for (int i = 0; i < 3; i++) {
                b[i] = sc.nextInt();
            }

            int x = game.max(a);
            int y = game.max(b);

            Winner winner;
            if (x > y) {
                winner = Winner.Alice;
            } else if (x < y) {
                winner = Winner.Bob;
            } else {
                winner = Winner.Tie;
            }

            output.append("Winner: ").append(winner).append("\n");
        }
        outputArea.setText(output.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameGUI gui = new GameGUI();
            gui.setVisible(true);
        });
    }
}
