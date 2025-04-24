#include<stdio.h>
int main()
{
	int x[10],y[10],z[10],i,j,k;
	int n,m,temp;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	printf("Enter y-array elements:");
	scanf("%d",&m);
	
	for(i=0;i<m;i++)
	{
		scanf("%d",&y[i]);
	}
	temp=n+m;
	
	for(i=0;i<n;i++)
	{
		z[i]=x[i];
	}
	for(j=0;j<m;j++)
	{
		z[i]=y[j];
		i++;
	}
	for(i=0;i<temp;i++)
	{
		for(k=0;k<temp-1;k++)
		{
			if(z[k]<=z[k+1])
			{
				j=z[k+1];
				z[k+1]=z[k];
				z[k]=j;
			}
		}
	}
	for(i=0;i<temp;i++)
	{
		printf("%d",z[i]);
	}
	printf("\n\n");
	return 0;
	
}