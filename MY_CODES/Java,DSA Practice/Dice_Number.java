/* Dice Number Alice and Bob are playing a game. Each player rolls a regular six faced dice 3 times.
   The score of a player is the maximum number that can be formed using the rolls.  
   The player with the highest score wins, and the game ends in a tie if both players have the same score.
   Find the winner of the game or determine whether it is a tie. */
   
   
import java.util.Scanner;
import java.util.Array;
import java.util.InputMismatchException;
import java.util.Stack;

// Inheritance
class Students {
    int n;

    public Students(int n) {
        this.n = n;
    }

    int getname() {
        return n;
    }
}

// Custom Exception class
class Students_Particing extends Exception 
{
    public Students_Particing(String message) 
	{
        super(message);
    }
}

// Interface
interface Attempted {
    Stack<Integer> Non_decreasing() throws Students_Particing;
}

// Polymorphism
class Problem_Letter extends Students implements Attempted 
{
    Stack<Integer> res = new Stack<>();
    int[] arr;

    public Problem_Letter(int n) {
        super(n);
        arr = new int[n];
    }

    // Method overriding
    @Override
    public Stack<Integer> Non_decreasing() throws Students_Particing {
        boolean temp = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                res.add(0);
                temp = false;
                break;
            }
        }
        if (temp) {
            res.add(1);
        }
        return res;
    }
}

public class Food_RatingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Demonstrating Stack, Inheritance, Polymorphism, Exception Handling, and Constructor Concepts");
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Problem_Letter p = new Problem_Letter(n);

        try {
            Stack<Integer> foodRating = p.Non_decreasing();
            System.out.println("Food rating: " + foodRating.pop());
        } catch (Students_Particing e) {
            System.out.println("Error occurred during non-decreasing check: " + e.getMessage());
        }
    }
}
