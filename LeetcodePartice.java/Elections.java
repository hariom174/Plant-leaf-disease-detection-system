/* Election season has started in Chefland and the election commission wants to know the count of eligible 
   voters.There are N people in Chefland where the age of the ith person in Ai.
   Given that a person needs to be at least X years old to vote, find the number of eligible voters. */

import java.util.Scanner;

class Person {
    int n;
    int x;

    public Person(int n, int x) {
        this.n = n;
        this.x = x;
    }
}

class Vote extends Person {
    public Vote(int n, int x) {
        super(n, x);
    }
    
    public int calculateEligibleCount() {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i >= x) {
                count++;
            }
        }
        return count;
    }
}

class People extends Vote {
    public People(int n, int x) {
        super(n, x);
    }
}

class Elections {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n number:");
        int n = in.nextInt();
        System.out.println("Enter the x number:");
        int x = in.nextInt();
        
        People p = new People(n, x);
        int eligibleCount = p.calculateEligibleCount();
        System.out.println("Eligible for vote: " + eligibleCount);
    }
}
