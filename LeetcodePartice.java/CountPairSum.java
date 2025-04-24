/* 2824. Count Pairs Whose Sum is Less than Target
   Given a 0-indexed integer array nums of length n and an integer target, return the number of 
   pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target. */
   
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

class CountThread extends Thread {
    ArrayList<Integer> nums;
    int target;

    public CountThread(int target, ArrayList<Integer> nums) {
        this.target = target;
        this.nums = nums;
    }

    @Override
    public void run() {
        try {
            int n = nums.size();
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums.get(i) + nums.get(j) < target) {
                        count++;
                    }
                }
            }
            System.out.println("Number of pairs where sum is less than target: " + count);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}

class CountPairSum {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int nums = in.nextInt();
        int[] arr = new int[nums];
        try {
            System.out.println("Enter the elements:");
            for (int i = 0; i < nums; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("Enter the target sum:");
            int target = in.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int num : arr) {
                arrayList.add(num);
            }
            CountThread t = new CountThread(target, arrayList);
            t.start();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            System.exit(1); // Exit the program if input is invalid.
        }
    }
}
