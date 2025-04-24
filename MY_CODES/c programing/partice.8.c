#include<stdio.h>
int main()
{
	int x[10],i,n,sum=0;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter X-array of elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	for(i=0;i<n;i++)
	{
		sum +=x[i];
		printf("Sum of the number %d\n",sum);
	}
	return 0;
}