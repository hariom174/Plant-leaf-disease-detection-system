#include<stdio.h>
int main()
{
	int x[10],i,n,max=0,min=0;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	for(i=0;i<n;i++)
	{
		if(x[i]>max)
		{
			max=x[i];
		}
		if(x[i]<min)
		{
			min=x[i];
		}
	}
	printf("Maximum number %d\n",max);
	printf("Minimum number %d",min);
	return 0;
}