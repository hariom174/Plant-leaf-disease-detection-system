/* Write a program to calculate the value of s where S=1+1/2+1/3+1/4+1/5+........1/50. */
public class Calculate2 {
    public static void main(String[]args)
    {
        float s=0;
        System.out.println("the value of s where S=1+1/2+1/3+1/4+1/5+........1/50.");
        for(int i=1;i<=50;i++)
        {
            s+=(float)1/i;
            System.out.println("value of S is :"+s);
        }
       
    }
}
