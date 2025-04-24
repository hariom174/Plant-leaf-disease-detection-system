#include<stdio.h>
int main()
{
	int x[10],i,n;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	
	for(i=0;i<n;i++)
	scanf("%d",&x[i]);
	
	for(i=n-1;i>=n;i--)
	{
		printf("%d",x[i]);
	}
	return 0;
}