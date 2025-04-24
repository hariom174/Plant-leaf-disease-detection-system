#include<stdio.h>
int main()
{
	int x[10],i,n,p,e;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array of elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	printf("Enter no of insert element:");
	scanf("%d",&p);
	printf("Enter new elements:");
	scanf("%d",&e);
	for(i=n;i>=p;i--)
		x[i]=x[i-1];
		
	x[p-1]=e;
	for(i=0;i<n+1;i++)
	{
		printf("%d\n",x[i]);
	}
	return 0;
}