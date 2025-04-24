/* There are 3 problems in a contest namely A,B,C respectively. Alice bets Bob that problem C is the hardest 
   while Bob says that problem B will be the hardest.
   You are given three integers SA,SB,SCwhich denotes the number of successful submissions of the problems 
   A,B,C respectively. It is guaranteed that each problem has a different number of submissions. Determine who 
   wins the bet.
  1.If Alice wins the bet (i.e. problem C is the hardest), then output Alice.
  2.If Bob wins the bet (i.e. problem B is the hardest), then output Bob.
  3.If no one wins the bet (i.e. problem A is the hardest), then output Draw.
  Note: The hardest problem is the problem with the least number of successful submissions. */

import java.util.Scanner;

class Hardest_Bet 
{
    public static String HardestProblemSet(int x, int y, int z) 
	{
        if (x == 0) 
		{
            return 1;
        } 
		else 
		{
            if (z < y && z < x) 
			{
                return "Alice"; // You can choose any integer value here based on your logic.
            } 
			else if (y < z && y < x) 
			{
                return "Bob"; // You can choose any integer value here based on your logic.
            } 
			else 
			{
                return "Draw"; // You can choose any integer value here based on your logic.
            }
        }
    }

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = in.nextInt();
        System.out.println("Enter the second number:");
        int y = in.nextInt();
        System.out.println("Enter the third number:");
        int z = in.nextInt();

        int result = HardestProblemSet(x, y, z);
        System.out.println("Result: " + result);
    }
}
