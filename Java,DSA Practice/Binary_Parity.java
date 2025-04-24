/* The binary parity of an integer N is defined as follows: 
   First, write N in binary.For example, N=13 is written as 1101 in binary, and N=5 is written as 101.Compute SN,the sum of the binary digits of 
   N.For example, from the earlier examples, 13=1+1+0+1=3 and 5=1+0+1=2.The binary parity of N is then the parity of 
   SN.S13=3 is odd, so 13 is said to have odd binary parity; while S6=2 is even, so 5 has even binary parity.
   Given an integer N, find its binary parity of SN. The parity of an integer is, quite simply, whether it's even or odd.
   We say an integer has even parity if it is a multiple of s6=2, and odd parity otherwise. */
   
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Binary extends Exception {
    public Binary(String message) {
        super(message);
    }
}

class Parity {
    int n;

    public Parity(int n) {
        this.n = n;
    }

    public int display() {
        return n;
    }
}

class OddNumber {
    public Parity checkParity(List<Integer> binaryDigits) throws Exception {
        int sum = 0;

        // Calculate the sum of binary digits
        for (int digit : binaryDigits) {
            sum += digit;
        }

        // Check if the sum is even or odd
        if (sum % 2 == 0) {
            return new Parity(0); // Even parity
        } else {
            return new Parity(1); // Odd parity
        }
    }
}

class Binary_Parity {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        List<Integer> binaryDigits = new ArrayList<Integer>();

        try {
            // Input binary digits
            System.out.println("Enter binary digits (0 or 1), enter -1 to finish:");
            int digit = in.nextInt();
            while (digit != -1) {
                if (digit != 0 && digit != 1) {
                    throw new Binary("Invalid binary digit: " + digit);
                }
                binaryDigits.add(digit);
                digit = in.nextInt();
            }

            // Check and display parity
            OddNumber oddNumber = new OddNumber();
            Parity result = oddNumber.checkParity(binaryDigits);

            System.out.println("Binary Parity Result: " + result.display());
        } catch (Binary e) {
            System.out.println("Binary Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
