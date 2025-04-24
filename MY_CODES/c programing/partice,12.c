#include<stdio.h>
int main()
{
	int x[10],i,j,k,n,ctr=0;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	for(i=0;i<n;i++)
	
		scanf("%d",&x[i]);
	
	for(i=0;i<n;i++)
	{
		ctr=0;
		for(j=0,k=n;j<k+1;j++)
		{
			if(i!=j)
			{
				if(x[i]=x[j])
				{
					ctr++;
				}
			}
		}
	        if(ctr==0)
	        {
		      printf("%d",x[i]);
	        }
	}
	return 0;
}