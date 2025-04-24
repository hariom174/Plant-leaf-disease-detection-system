/* Chef is playing a video game, and is now fighting the final boss.The boss has H health points. Each attack of 
   Chef reduces the health of the boss by X.Chef also has a special attack that can be used at most once, and 
   will decrease the health of the boss by Y.
   Chef wins when the health of the boss is ≤0.
   What is the minimum number of attacks needed by Chef to win? */

import java.util.Scanner;

class Videogame 
{
    int x; // The boss has x health points.
    int y; // the health of the boss by y.
    int z; // decrease the health of the boss by z

    public Videogame(int x, int y, int z)
	{
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Health_boss extends Videogame 
{
    public Health_boss(int x, int y, int z) 
	{
        super(x, y, z);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the health of boss:");
        this.x = in.nextInt();
        System.out.println("Enter the health of the boss by Y:");
        this.y = in.nextInt();
        System.out.println("Enter the health of the boss by Z:");
        this.z = in.nextInt();

        int c = 1;
		
        if(x>0)
		{
            x = x - y;
            c++;
      		System.out.println(c);
        }
     
        
    }
}
class Singleuse_Attack
{
    public static void main(String[] args) 
	{
        Health_boss h = new Health_boss();
    }
}
