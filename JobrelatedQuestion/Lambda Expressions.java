import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// Define an interface for character counting
interface CharacterCounterInterface {
    int countCharacters(int n, Scanner in, String chars);
}

// Base class implementing the interface
class CharacterCounter implements CharacterCounterInterface {
    @Override
    public int countCharacters(int n, Scanner in, String chars) {
        int[] charCounts = new int[chars.length()]; // To store counts for 'c', 'o', 'd', 'e', 'h', 'f'

        IntStream.range(0, n).forEach(k -> {
            String s = in.next();
            s.chars().forEach(c -> {
                int index = chars.indexOf(c);
                if (index >= 0) {
                    charCounts[index]++;
                }
            });
        });

        // Return the minimum count (basic logic)
        Arrays.sort(charCounts);
        return charCounts[0];
    }
}

// Derived class that overrides the method
class CodechefCounter extends CharacterCounter {
    @Override
    public int countCharacters(int n, Scanner in, String chars) {
        int[] charCounts = new int[chars.length()]; // To store counts for 'c', 'o', 'd', 'e', 'h', 'f'

        IntStream.range(0, n).forEach(k -> {
            String s = in.next();
            s.chars().forEach(c -> {
                int index = chars.indexOf(c);
                if (index >= 0) {
                    charCounts[index]++;
                }
            });
        });

        // Adjust counts for 'c' and 'e' (since we need pairs of these characters)
        charCounts[0] /= 2; // 'c'
        charCounts[3] /= 2; // 'e'

        Arrays.sort(charCounts);
        return charCounts[0];
    }
}

public class Lambda Expressions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create an instance of CodechefCounter
        CharacterCounterInterface counter = new CodechefCounter();

       
            int n = in.nextInt();
            in.nextLine(); // consume the newline character

            String chars = "codehf";
            int result = counter.countCharacters(n, in, chars);
            System.out.println(result);
        
    }
}
