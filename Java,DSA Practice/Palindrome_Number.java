/* Given an integer x, return true if x is a palindrome, and false otherwise */
/* Example 1:
   Input: x = 121
   Output: true
   Explanation: 121 reads as 121 from left to right and from right to left.
 */

import java.util.Scanner;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0 ||(x%10==0 && x%10!=0)) {
            return false;
        }
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = (reversed * 10) + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Palindrome_Number p = new Palindrome_Number();
        boolean result = p.isPalindrome(num);

        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
