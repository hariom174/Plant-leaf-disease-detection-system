#include<stdio.h>
int main()
{
	int X[20],i,n;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array of elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&X[i]);
	}
	for(i=n-1;i>=0;i--)
	{
		printf("%d\n",X[i]);
	}
	return 0;
}