#include<stdio.h>
int main()
{
	int x[10],y[10],z[10],i,n;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	printf("\n The even elements are:");
	for(i=0;i<n;i++)
	{
		if(x[i]%2==0)
		{
			y[i] = x[i];
			printf("%d\n",y[i]);
		}
	}
	printf("\n The odd elements are:");
	for(i=0;i<n;i++)
	{
		if(x[i]%2!=0)
		{
			z[i] = x[i];
			printf("%d\n",z[i]);
		}
	}
	return 0;		
}