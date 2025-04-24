/* Given an integer N, let us consider a triangle of numbers of N lines in which a number a11 appears in the 
   first line, two numbers a21 and a22 appear in the second line, three numbers a31, a32 and a33 appear in the 
   third line, etc. In general, i numbers 1,2...ai1 ,ai2… aii appear in the ith line for all 1≤i≤N. Develop a
   program that will compute the largest of the sums of numbers that appear on the paths starting from the top 
   towards the base, so that:
   on each path the next number is located on the row below, more precisely either directly below or below and 
   one place to the right. */
 
import java.util.Scanner;
import java.util.ArrayList;

class Traingle {
    int n;

    public Traingle(int n) {
        this.n = n;
    }
}

interface Largest {
    ArrayList<Integer> Develop();
}

class Located extends Traingle implements Largest {
    int arr[][];

    public Located(int n) {
        super(n);
        arr = new int[n][n];
    }

    public ArrayList<Integer> Develop() {
        Scanner in = new Scanner(System.in); // Moved Scanner initialization here
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = in.nextInt(); // Fix input reading
            }
        }

        for (int j = n - 2; j >= 0; j--) {
            for (int k = 0; k <= j; k++) {
                arr[j][k] = arr[j][k] + Math.max(arr[j + 1][k], arr[j + 1][k + 1]);
            }
        }

        result.add(arr[0][0]);
        return result;
    }
}

public class Sums_Triangle {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of array elements:");
        int n = in.nextInt();

        Located l = new Located(n);
        ArrayList<Integer> rs = l.Develop();

        System.out.println("Find the largest number: " + rs.get(0));
    }
}
