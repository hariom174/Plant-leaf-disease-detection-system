/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a 
   given target value.
   If target is not found in the array, return [-1, -1].
   You must write an algorithm with O(log n) runtime complexity. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CustomException extends Exception 
{
    public CustomException(String message) 
	{
        super(message);
    }
}

class SearchResult 
{
    private int startingPosition;
    private int endingPosition;

    public SearchResult(int startingPosition, int endingPosition) 
	{
        this.startingPosition = startingPosition;
        this.endingPosition = endingPosition;
    }

    public int getStartingPosition() 
	{
        return startingPosition;
    }

    public int getEndingPosition() 
	{
        return endingPosition;
    }
}

class SearchRangeProcessor 
{
    public SearchResult searchRange(List<Integer> nums, int target) throws CustomException 
	{
        if (nums == null || nums.isEmpty()) 
		{
            throw new CustomException("Input list is empty");
        }

        int[] result = new int[]{-1, -1};

        // Find the starting position
        result[0] = findStartingPosition(nums, target);
        // Find the ending position
        result[1] = findEndingPosition(nums, target);

        return new SearchResult(result[0], result[1]);
    }

    private int findStartingPosition(List<Integer> nums, int target) 
	{
        int start = 0, end = nums.size() - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums.get(mid) == target && (mid == 0 || nums.get(mid - 1) < target)) 
			{
                result = mid;
                break;
            } else if (nums.get(mid) < target) 
			{
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    private int findEndingPosition(List<Integer> nums, int target) 
	{
        int start = 0, end = nums.size() - 1;
        int result = -1;

        while (start <= end) 
		{
            int mid = start + (end - start) / 2;

            if (nums.get(mid) == target && (mid == nums.size() - 1 || nums.get(mid + 1) > target)) 
			{
                result = mid;
                break;
            } else if (nums.get(mid) > target) 
			{
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}

public class FirstandLast_PostionSorted 
{
    public static void main(String[] args) 
	{
        List<Integer> inputData = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of array elements:");
        int n = in.nextInt();
        
        System.out.println("Enter the x-array elements:");
        for (int i = 0; i < n; i++) 
		{
            inputData.add(in.nextInt());
        }

        SearchRangeProcessor processor = new SearchRangeProcessor();

        try 
		{
            SearchResult searchResult = processor.searchRange(inputData, 4);
            System.out.println("Starting Position: " + searchResult.getStartingPosition());
            System.out.println("Ending Position: " + searchResult.getEndingPosition());
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
