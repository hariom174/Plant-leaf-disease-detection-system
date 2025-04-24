#include<stdio.h>
int main()
{
	int x[10],y[10],i,n;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter X-array elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	for(i=0;i<n;i++)
	{
		y[i]=x[i];
	}
	printf("First array elements:\n");
	for(i=0;i<n-1;i++)
	{
		printf("%d\n",x[i]);
	}
	printf("Second array elements:\n");
	for(i=0;i<n-1;i++)
	{
		printf("%d\n",y[i]);
	}
	return 0;
}