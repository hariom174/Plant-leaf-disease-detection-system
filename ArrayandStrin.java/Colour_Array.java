 /* Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali
    both have the same height, K. Many players saw this trick and also started hiding behind Ali.*/

import java.util.Scanner;
public class Colour
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		int k=in.nextInt();
		int arr[]=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			if(arr[i]>k)
			{
				count++;
			}
		}
		System.out.println("The height of same:"+count);
	}
}