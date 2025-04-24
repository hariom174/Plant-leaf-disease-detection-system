/* 2824. Count Pairs Whose Sum is Less than Target
   Given a 0-indexed integer array nums of length n and an integer target, return the number of 
   pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target. */
   
import java.util.Scanner;
import java.util.ArrayList;

class CountThread extends Thread  {
	List<Integer> nums;
	int target;
	
	public CountThread(int target,List<Integer> nums) {
		this.target=target;
		this.nums=nums;
	}
	@Override
	public Sum run() {
		try {
			int n=nums.size();
			int count=0;
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++)
				{
					if(nums.get(i)+nums.get(j)<target) {
						count++;
					}
				}
			}
			return count;
		}
	catch(ArithmeticException e) {
		System.out.println(" ArithmeticException ");
	   }
	}
}

class CountPair {
	public static void main(String... args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int nums=in.nextInt();
		int target;
		int[] arr=new int[nums];
		try {
			for(int i=0;i<nums;i++)
			{
				arr[i]=in.nextInt();
			}
		}
		catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            System.exit(1); // Exit the program if input is invalid.
        }
		CountThread t=new CountThread(nums,target);
		t.start();
	}
}