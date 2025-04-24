/* You have been recently hired as a developer in CodeChef. Your first mission is to implement a feature that will 
   determine the number of submissions that were judged late in a contest.There are N submissions, numbered 1 through N. 
   For each valid i, the i-th submission was submitted at time Si and judged at time Ji (in minutes). Submitting and 
   judging both take zero time. Please determine how many submissions received their verdicts after a delay of more than
   5 minutes. */
   

import java.util.Scanner;
import java.util.InputMismatchException;

class JudgeThread extends Thread {
    private Scanner scanner;
    private int numCases;
    private int delayCount;

    public JudgeThread(Scanner scanner) {
        this.scanner = scanner;
        this.numCases = 0;
        this.delayCount = 0;
    }

    @Override
    public void run() {
        try {
            numCases = scanner.nextInt(); // Read the number of cases
            for (int i = 0; i < numCases; i++) {
                int a = scanner.nextInt(); // Read arrival time
                int b = scanner.nextInt(); // Read departure time
                if (Math.abs(a - b) > 5) { // Check for delay
                    synchronized (this) {
                        delayCount++;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }

    public int getDelayCount() {
        return delayCount;
    }
}

public class JudgingDelay {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        JudgeThread judgeThread = new JudgeThread(scanner);

        judgeThread.start(); // Start the thread

        try {
            judgeThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        int delayCount = judgeThread.getDelayCount();
        System.out.println("Number of cases with delay: " + delayCount);
    }
}
