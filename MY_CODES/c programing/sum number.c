#include<stdio.h>
int main()
{
	int x[10],i,n,sum=0;
	printf("enter the no of elements");
	scanf("%d",&n);
	
	printf("Enter the x-array elments:");
	for(i=0;i<n;i++)
	{
		printf("Sum of array is %d",i);
		scanf("%d",&x[i]);
	}
	for(i=0;i<n;i++)
	{
		sum+=x[i];
	}
	return 0;
}