#include<stdio.h>
int main()
{
	int x[10],i,n,j,temp;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(x[j]<x[i])
			{
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}
	}
	printf("The ascending order elements are:\n");
	for(i=0;i<n;i++)
	{
		printf("%d\n",x[i]);
	}
	return 0;
	
}