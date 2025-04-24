// write a c program to factors and no of factors of given number?

#include<stdio.h>
int main() 
{
	int n,i,count;
	printf("Enter n:");
	scanf("%d",&n);
	count=0;
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			printf("%d\n",i);
			count++;
		}
	}
	    printf("No factors=%d",count);
		
		return 0;  
}