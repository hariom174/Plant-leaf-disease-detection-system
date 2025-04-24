/* Team RCB has earned X points in the games it has played so far in this year's IPL. To qualify for the 
   playoffs they must earn at least a total of Y points. They currently have Z games left, in each game they 
   earn 2 points for a win, 1 point for a draw, and no points for a loss.
   Is it possible for RCB to qualify for the playoffs this year? */

import java.util.Scanner;

class Team implements Runnable
 {
    private int x;
    private int y;
    private int z;

    public Team(int x, int y, int z) 
	{
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void run() 
	{
        Player();
    }

    private void Player() 
	{
        z = (z * 2) + x;

        if (z >= y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class RCB_Playoffs 
{
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first earned point:");
        int x = in.nextInt();//2
        System.out.println("Enter the second earned point:");
        int y = in.nextInt();//8
        System.out.println("Enter the third earned point:");
        int z = in.nextInt();//4

        Runnable qualify = new Team(x, y, z);
        Thread qualifyThread = new Thread(qualify);
        qualifyThread.start();
    }
}
