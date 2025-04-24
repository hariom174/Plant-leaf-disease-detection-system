#include<stdio.h>
int main()
{
	int x[10],y[10],i,j,n,count;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
		y[i]=-1;
	}
	for(i=0;i<n;i++)
	{
		count=1;
		for(j=i+1;j<n;j++)
		{
			if(x[i]==x[j])
			{
				count++;
				y[j]=0;
			}
		}
		if(y[i]!=0)
		{
			y[i]=count;
		}
	}
	for(i=0;i<n;i++)
	{
		if(y[i]!=0)
		{
			printf("%d occurs %d time\n",x[i],y[i]);
		}
	}
	return 0;
}