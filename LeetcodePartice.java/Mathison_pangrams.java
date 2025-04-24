/* Read problems statements in mandarin chinese, russian and vietnamese as well.
   Mathison recently inherited an ancient papyrus that contained some text. Unfortunately, the text
   was not a pangram. Now, Mathison has a particular liking for holoalphabetic strings and the text
   bothers him. The good news is that Mathison can buy letters from the local store in order to turn 
   his text into a pangram.
   However, each letter has a price and Mathison is not very rich. Can you help Mathison find the 
   cheapest way to obtain a pangram? */
   
import java.util.ArrayList;
import java.util.Scanner;

// CharacterSumCalculator class encapsulates the logic for reading input values, calculating the sum,
// and handling exceptions.
class CharacterSumCalculator {
    private char[] c; // Array to hold characters 'a' to 'z'
    private int[] arr; // Array to hold corresponding values

    // Constructor initializes the character array 'c' with characters 'a' to 'z'
    public CharacterSumCalculator() {
        c = new char[26];
        arr = new int[26];
        for (int i = 0; i < 26; i++) {
            c[i] = (char) ('a' + i);
        }
    }

    // Method to read input values from the user
    public void readInput() throws CustomCheckedException {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 26; i++) {
            try {
                arr[i] = in.nextInt();
                // Check if input value is negative
                if (arr[i] < 0) {
                    throw new CustomCheckedException("Negative value not allowed");
                }
            } catch (Exception e) {
                // Throw custom checked exception for invalid input
                throw new CustomCheckedException("Invalid input", e);
            }
        }
    }

    // Method to calculate the sum of values for characters not present in the input string
    public int calculateSum(String str) throws CustomUncheckedException {
        int sum = 0;
        // Iterate over characters 'a' to 'z'
        for (int i='a'; i<='z'; i++) {
            // If character is not present in the input string, add its corresponding value to the sum
            if (str.indexOf(i) == -1) {
                sum += arr[i - 'a'];
            }
        }
        return sum;
    }
}

// Custom checked exception class
class CustomCheckedException extends Exception {
    // Constructor with message
    public CustomCheckedException(String message) {
        super(message);
    }

    // Constructor with message and cause
    public CustomCheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Custom unchecked exception class
class CustomUncheckedException extends RuntimeException {
    // Constructor with message
    public CustomUncheckedException(String message) {
        super(message);
    }

    // Constructor with message and cause
    public CustomUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Main class containing the main method
public class Mathison_pangrams {
    public static void main(String[] args) {
        CharacterSumCalculator calculator = new CharacterSumCalculator();
        try {
            // Read input values
            calculator.readInput();
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = in.next();
            // Calculate sum of values for characters not present in the input string
            int sum = calculator.calculateSum(str);
            System.out.println("Sum of values for characters not present in the string: " + sum);
        } catch (CustomCheckedException e) {
            // Catch and handle custom checked exception
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (CustomUncheckedException e) {
            // Catch and handle custom unchecked exception
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
